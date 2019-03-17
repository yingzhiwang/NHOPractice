create table If not exists trainingCamp(
  id INT UNSIGNED AUTO_INCREMENT,
  trainingCampName varchar(50),
  trainingCampDescription varchar(500),
  trainingCampCreateTime datetime,
  trainingCampLastModifyTime datetime,
  trainingCampFlag int,
  PRIMARY KEY (id)
);

create table If not exists taskCard(
  id INT UNSIGNED AUTO_INCREMENT,
  taskCardName varchar(50),
  taskCardDescription varchar(500),
  taskCardCreateTime datetime,
  taskCardLastModifyTime datetime,
  taskCardFlag int,
  PRIMARY KEY (id)
);

create table If not exists campCardRelation(
  id INT UNSIGNED AUTO_INCREMENT,
  trainingCampId int,
  taskCardId int,
  tCampCardRelationCreateTime datetime,
  campCardRelationLastModifyTime datetime,
  cmpCardRelationFlag int,
  PRIMARY KEY (id)
);