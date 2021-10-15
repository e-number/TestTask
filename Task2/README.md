###Задание:

Программа должна получать на вход *.js-файл <br>(пример файла
https://github.com/SAP-samples/s4hana-ext-deploy-custom-ui/blob/master/webapp/controller/Detail.controller.js)
<br><br>Обработать входной файл и вывести на экран наименования только тех функций, у которых
есть входные параметры, с указанием их количества. <br><br>Не учитывать вложенные функции
(определенные внутри тела функции в качестве переменных или callback-функций).
<br><br>Пример вывода для функции _deleteOneEntity: function (sPath, fnSuccess, fnFailed) :
#####_deleteOneEntity : 3