INSERT INTO course_numbers(course_index)VALUES ('2');

INSERT INTO group_numbers(course_numbers_id,group_index)VALUES ('1','2');
INSERT INTO group_numbers(course_numbers_id,group_index)VALUES ('1','9');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Численные методы','Игнатенко М.В.','1','404','1','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Численные методы','Игнатенко М.В.','2','419','1','true','1');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Физкультура','Усач','3','Sport Complex','1','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Методы прогр. и информ.','Блинов И.Н.','4','433','1','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Англ. яз.','Тригубкина С.Н.,Бизюк Л.К. ','5','342,350','1','false','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Физкультура','Усач','1','Sport Complex','2','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Web-программирование','Романчик В.С.','2','411-2','2','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дискретная математика','Метельский Ю.М.','3','412а','2','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дискретная математика','Метельский Ю.М.','4','412а','2','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Военка','Военные','0','Чернышевского','3','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','EPAM','Преподаватели EPAM','0','Купревича','4','true','0');

INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. Геом. и комп. графика','Вылегжанин Д.В.','1','606','5','true','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Выч. Геом. и комп. графика','Вылегжанин Д.В.','2','411-3','5','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дифф. уравненеия','Руденок А.Е.','3','355','5','false','0');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Дифф. уравненеия','Руденок А.Е.','4','609','5','true','1');
INSERT INTO pair(course_id,group_id,name,teacher,number,classroom,day,lecture,even_day)VALUES ('1','1','Англ. яз.','Тригубкина С.Н.,Бизюк Л.К. ','4','342,355','5','false','2');