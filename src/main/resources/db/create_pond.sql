CREATE TABLE `ponds_managing` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `judet` varchar(45) NOT NULL DEFAULT 'Iasi',
  `location` varchar(45) NOT NULL,
  `phone_number` int NOT NULL,
  `price` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `rating_pond` varchar(45) NOT NULL,
  `rating_road` varchar(45) NOT NULL,
  `night_camp` varchar(45) NOT NULL,
  `crap` tinyint(3) unsigned zerofill NOT NULL,
  `caras` tinyint NOT NULL,
  `rapitor` tinyint NOT NULL,
  `fitofag` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `location_UNIQUE` (`location`)
)