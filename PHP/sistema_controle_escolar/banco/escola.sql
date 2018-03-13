-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20-Jul-2016 às 02:30
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `escola`
--
CREATE DATABASE IF NOT EXISTS `escola` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `escola`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_aluno`
--

CREATE TABLE IF NOT EXISTS `cadastro_aluno` (
  `matricula` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `telefone` varchar(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`matricula`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `cadastro_aluno`
--

INSERT INTO `cadastro_aluno` (`matricula`, `nome`, `endereco`, `telefone`, `email`) VALUES
(1, 'teste', 'teste', '9999-9999', 'teste@teste.com'),
(2, 'allan', 'teste', '9999-9999', 'allan@allan.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_professor`
--

CREATE TABLE IF NOT EXISTS `cadastro_professor` (
  `registro` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  PRIMARY KEY (`registro`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE IF NOT EXISTS `disciplina` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`id`, `nome`) VALUES
(1, 'portugues'),
(2, 'matematica'),
(3, 'historia'),
(4, 'geografica'),
(5, 'fisica'),
(6, 'quimica');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `senha` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `login`, `senha`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `nota`
--

CREATE TABLE IF NOT EXISTS `nota` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bimestre` varchar(50) NOT NULL,
  `ano` int(11) NOT NULL,
  `nota` double DEFAULT NULL,
  `idDisciplina` bigint(20) NOT NULL,
  `matricula` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idDisciplina` (`idDisciplina`),
  KEY `matricula` (`matricula`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `nota`
--

INSERT INTO `nota` (`id`, `bimestre`, `ano`, `nota`, `idDisciplina`, `matricula`) VALUES
(3, '1 bimestre', 2016, 10, 2, 2);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `matricula` FOREIGN KEY (`matricula`) REFERENCES `cadastro_aluno` (`matricula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idDisciplina` FOREIGN KEY (`idDisciplina`) REFERENCES `disciplina` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
