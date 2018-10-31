/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entrecodigos.daoimp;

import com.entrecodigos.dao.prueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author samv
 */
@Component("objEditorialDao")
@Transactional
public class pruebadaoimp implements prueba{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object getPrueba() {
        Object consulta = jdbcTemplate.queryForList("select * from datos.p_quirog limit 10;");
        return consulta;
    }
}
