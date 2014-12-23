/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.genarator;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 *
 * @author Chari
 */
public class PatientGenarator implements IdentifierGenerator{
    

    @Override
    public Serializable generate(SessionImplementor session, Object o) throws HibernateException {
        Calendar calender = Calendar.getInstance();
        String prefix = ""+calender.get(Calendar.YEAR);
        Connection connection = session.connection();
        try {

            PreparedStatement ps = connection.prepareStatement("SELECT nextval ('patient_seq') as nextval");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("nextval");
                String code = prefix + StringUtils.leftPad("" + id,6, '0');
                return code;
            }

        } catch (SQLException e) {
            throw new HibernateException(
                    "Unable to generate Patient id Sequence");
        }
        return null;
    }
    
}
