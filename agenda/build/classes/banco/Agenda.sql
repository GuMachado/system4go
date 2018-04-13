/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  etec
 * Created: 06/04/2018
 */

create database if not exists agenda;

create table contato(
     codigo INT(5) AUTO_INCREMENT PRIMARY KEY,
     nome VARCHAR(30) NOT NULL,
     telefone VARCHAR(9) NOT NULL,
     email VARCHAR(50)
);