-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 08-Jul-2016 às 02:41
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `banco`
--
CREATE DATABASE IF NOT EXISTS `banco` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `banco`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE IF NOT EXISTS `cadastro` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefone` varchar(10) NOT NULL,
  `sexo` enum('M','F') DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`id`, `nome`, `sobrenome`, `email`, `telefone`, `sexo`, `login`, `senha`) VALUES
(2, 'allan', 'souza', 'allan@hotmail.com', '9999-9999', 'M', 'allan', '25d55ad283aa400af464c76d713c07ad');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `telefone`, `email`, `cpf`) VALUES
(1, 'allan', '1234-5678', 'allan@hotmail.com', '123.456.789-00'),
(2, 'teste', '1234-5678', 'teste@teste.com', '123.456.789-00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `quant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `descricao`, `preco`, `quant`) VALUES
(7, 'teste1', 2.5, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `senha` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `login`, `senha`) VALUES
(1, 'allan', '202cb962ac59075b964b07152d234b70');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
