
truncate table trainingCamp;
insert into trainingCamp values
(
  1,
  N'敏捷训练营',
  N'京东敏捷实战特训，京东内部的高绩效团队培训，真正的敏捷培训，为你深度分享用户故事、敏捷估算、敏捷项目计划及跟踪（任务看板，每日会议）等敏捷实践。',
  sysdate(),
  sysdate(),
  0
);

truncate table taskCard;
insert into taskCard values
(
  1,
  N'任务卡1',
  N'京东敏捷实战特训，京东内部的高绩效团队培训，真正的敏捷培训，为你深度分享用户故事、敏捷估算、敏捷项目计划及跟踪（任务看板，每日会议）等敏捷实践。',
  sysdate(),
  sysdate(),
  0
);


insert into taskCard values
(
  2,
  N'任务卡2',
  N'了解数据和基本的EDA、数据清洗、搭建和选择统计学模型、模型和数据的诊断。',
  sysdate(),
  sysdate(),
  0
);

truncate table campCardRelation;
insert into campCardRelation values
(
  1,
  1,
  1,
  sysdate(),
  sysdate(),
  0
);
insert into campCardRelation values
(
  2,
  1,
  2,
  sysdate(),
  sysdate(),
  0
);

