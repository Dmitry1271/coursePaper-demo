INSERT INTO course_numbers(course_index)VALUES ('2');

INSERT INTO group_numbers(course_numbers_id,group_index)VALUES ('1','2');
INSERT INTO group_numbers(course_numbers_id,group_index)VALUES ('1','9');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Численные методы','Игнатенко М.В.','1','404','1','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Численные методы','Игнатенко М.В.','2','419','1','true','1');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Численные методы','Игнатенко М.В.','2','419','1','true','2');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Физкультура',null,'3',null,'1','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Методы прогр. и информ.','Блинов И.Н.','4','433','1','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Англ. яз.','Тригубкина С.Н.,Бизюк Л.К. ','5','342,350','1','false','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Физкультура',null,'1',null,'2','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Web-программирование','Романчик В.С.','2','411-2','2','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дискретная математика','Метельский Ю.М.','3','412а','2','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дискретная математика','Метельский Ю.М.','4','412а','2','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Военная кафедра',null,'0',null,'3','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','EPAM',NULL ,'0',NULL ,'4','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. Геом. и комп. графика','Вылегжанин Д.В.','1','606','5','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. Геом. и комп. графика','Вылегжанин Д.В.','2','411-3','5','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дифф. уравненеия','Руденок А.Е.','3','355','5','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дифф. уравненеия','Руденок А.Е.','4','609','5','true','1');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Англ. яз.','Тригубкина С.Н.,Бизюк Л.К. ','4','342,355','5','false','2');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. практика','Кремень Е.В., Вельченко С.А.','1','120, 404','6','false','1');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. практика, Вельченко С.А.','Кремень Е.В., Вельченко С.А.','2','120, 404','6','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Английский язык','Тригубкина С.Н.,Бизюк Л.К.','3','336, 232','6','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','Численные методы','Игнатенко М.В.','1','404','1','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','Физкультура',null,'1',null,'2','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','Военная кафедра',null,'0',null,'3','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','EPAM',NULL ,'0',NULL ,'4','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','Выч. Геом. и комп. графика','Вылегжанин Д.В.','1','606','5','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','2','Выч. практика','Кремень Е.В., Вельченко С.А.','1','120, 404','6','false','1');