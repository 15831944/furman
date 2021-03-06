ALTER TABLE `public`.`diler_order` DROP FOREIGN KEY `DILER_ORDER_CUSTOMER_CONSTR` ;
ALTER TABLE `public`.`diler_order` DROP COLUMN `ORDER_ID` , DROP COLUMN `FK_DESIGNER_ID` , DROP COLUMN `FK_WORKED_DAILY_SHEET_ID` , CHANGE COLUMN `DESCRIPTION` `DESCRIPTION` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `FK_CREATED_DAILY_SHEET_ID` `CREATED_DAILY_SHEET_ID` BIGINT(64) NULL DEFAULT NULL  , CHANGE COLUMN `FK_CUSTOMER_ID` `CUSTOMER_ID` BIGINT(64) NULL DEFAULT NULL  , 
  ADD CONSTRAINT `DILER_ORDER_CUSTOMER_CONSTR`
  FOREIGN KEY (`CUSTOMER_ID` )
  REFERENCES `public`.`customer` (`ID` )
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
, DROP INDEX `SYS_IDX_10277` 
, ADD INDEX `SYS_IDX_10277` (`CUSTOMER_ID` ASC) ;

ALTER TABLE `public`.`diler_order_item` DROP COLUMN `ORDER_ID` ;
ALTER TABLE `public`.`diler_order_item` DROP COLUMN `ORDER_ITEM_ID` ;

ALTER TABLE `public`.`diler_order_detail` CHANGE COLUMN `GLUEING` `GLUEING` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `MILLING` `MILLING` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `GROOVE` `GROOVE` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `ANGLE45` `ANGLE45` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `DRILLING` `DRILLING` LONGTEXT NULL DEFAULT NULL  , CHANGE COLUMN `CUTOFF` `CUTOFF` LONGTEXT NULL DEFAULT NULL  ;
ALTER TABLE `public`.`diler_order_detail` DROP COLUMN `ORDER_ITEM_ID` ;
