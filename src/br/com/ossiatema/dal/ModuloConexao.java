/*
 * The MIT License
 *
 * Copyright 2024 fred_.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.ossiatema.dal;

import java.sql.*;

/**
 * Conexão com o banxo de dados
 *
 * @author fred_
 */
public class ModuloConexao {

    /**
     * metodo responsavel por estabelecer conexao com o banco
     *
     * @return conexão
     */
    public static Connection conector() {
        Connection conexao;
        // a linha a baixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando informaçoes refente ao banco
        String url = "jdbc:mysql://localhost:3306/dbprojetoos?characterEncoding=utf-8";
        String user = "root";
        String password = "1020304050";
        // estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // a linha a baixo serve de apaio para exclarecer o erro
            //System.out.println(e);
            return null;
        }
    }

   }
