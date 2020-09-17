/*
 * Copyright (c) 2020 The Eclipse Foundation and others.
 * 
 * This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution, and is available at https://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.demo.simple;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@eclipse-foundation.org)
 */
@WebServlet(name = "hello", urlPatterns = {"/hello"})
public class SimpleHello  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        resp.setContentType("text/html;charset=UTF-8");
        
        resp.getWriter().println( "Hello Jakarta EE 9!");
    }
}
