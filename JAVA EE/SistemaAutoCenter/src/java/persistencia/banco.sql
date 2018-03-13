-- phpMyAdmin SQL Dump
-- version 4.4.13.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 15, 2016 at 11:02 PM
-- Server version: 5.6.31-0ubuntu0.15.10.1
-- PHP Version: 5.6.11-1ubuntu3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db`
--
CREATE DATABASE IF NOT EXISTS `db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `db`;

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(32) NOT NULL,
  `telefone` varchar(10) NOT NULL,
  `endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `precoUnitario` double NOT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `quantidade`, `precoUnitario`, `url`) VALUES
(3, 'Sensores', 99, 0, 'img/produto1.jpg'),
(4, 'Alarmes', 99, 0, 'img/produto2.jpg'),
(5, 'Pneus', 99, 0, 'img/produto3.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `servicos`
--

CREATE TABLE IF NOT EXISTS `servicos` (
  `id` bigint(20) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `preco` double NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `dica` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `servicos`
--

INSERT INTO `servicos` (`id`, `tipo`, `preco`, `url`, `dica`) VALUES
(1, 'Motor', 0, 'img/motor.jpg', 'motor.jsp'),
(2, 'Escapamento', 0, 'img/escapamento.jpg', 'escapamento.jsp'),
(3, 'Suspensão', 0, 'img/suspensao.jpg', 'suspensao.jsp'),
(4, 'Injeção eletrônica', 0, 'img/eletronica.jpg', 'injecao.jsp'),
(6, 'Rodas', 0, 'img/roda.jpg', 'rodas.jsp'),
(7, 'Amortecedor', 0, 'img/amortecedor.jpg', 'amortecedor.jsp');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` bigint(20) NOT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(32) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `login`, `senha`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- --------------------------------------------------------

--
-- Table structure for table `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `id` bigint(20) NOT NULL,
  `cliente` bigint(20) NOT NULL,
  `produto` bigint(20) DEFAULT NULL,
  `quant_produto` int(11) DEFAULT NULL,
  `servico` bigint(20) DEFAULT NULL,
   data_compra varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `servicos`
--
ALTER TABLE `servicos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `login` (`login`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cliente` (`cliente`),
  ADD KEY `produto` (`produto`),
  ADD KEY `servico` (`servico`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `servicos`
--
ALTER TABLE `servicos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`id`),
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`produto`) REFERENCES `produtos` (`id`),
  ADD CONSTRAINT `vendas_ibfk_3` FOREIGN KEY (`servico`) REFERENCES `servicos` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
