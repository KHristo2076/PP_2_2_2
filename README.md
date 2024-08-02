<h2><strong>Условие:</strong></h2>

<p><br>
Склонируйте заготовку проекта по <a href="https://github.com/KataAcademy/PP_2_2_2_spring-mvc" target="_blank">ссылке</a>.<br>
На данном этапе начинается самое интересное: ваше приложение начнет получать запросы и возвращать ответы. Плюс к этому, мы создадим приложение, которое будет запускаться и управляться с помощью сервера Tomcat. IDE поможет работать с ним без сложных консольных команд, что сильно облегчит разработку.<br>
В этом приложении мы используем только зависимость <code>spring</code>—<code>webmvc</code>. Это не значит, что нам больше не нужны бины или контекст, в данном случае webmvc—фреймворк будет работать самостоятельно, так как любой фреймворк Спринга содержит в себе <code>spring</code>—<code>core</code>.<br>
В приложении появился новый пакет <code>controller</code>, в котором содержатся классы, держащие группы сервлетов - контроллеры. Данная технология позволит нам избежать создания большого количества сервлетов. Контроллеры содержат методы, которые маппятся на разные url и http-методы, заменяя собой класс сервлета с методами <code>doGet, doPost </code>и т.д.</p>

<p style="text-align: center;">&nbsp;</p>

<p style="max-width: 55%;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<img alt="" id="Рисунок_x0020_4" src="https://lh6.googleusercontent.com/V0zHFfJUyF5SQXFwhSYqJhvFycC9unMxUg3ca233LFTeBO9wKsT-2nNGWyIfhUhckqiQZS0IF2xwL1DY7F2B9kQMG1qqNRhCva2KtVp9-XZ-NoZiBPjEp1fO_sM1v3Db78nv_44T" style="text-align: center; max-width: 100%;"></p>

<p>Для запуска приложения перейдите в <code>Project Structure</code> во вкладку <code>Modules</code>.<br>
Выберите модуль spring_mvc и нажмите “+”. Далее следует выбрать модуль <code>Spring</code> и IDEA сама подтянет класс—иницилайзер <code>WebConfig</code>, если это не произошло автоматически, то пропишите абсолютный путь на этот файл.<br>
Аналогично нужно создать модуль <code>Web</code>, но в этом случае путь должен ссылаться на папку <code>webapp</code>.</p>

<p>Теперь обратимся к сборке проекта, в файл<code> pom.xml</code>:</p>

<p style="max-width: 70%; text-align: right;"><img alt="" src="https://sun9-55.userapi.com/c857124/v857124447/f0d41/ACNc4bfWMvA.jpg" style="max-width: 100%;"></p>

<p>Для правильной интерпретации структуры проекта требуется указать следующие параметры:<br>
1) <code>failOnMissingWebXml </code>позволит нам запускать проект с помощью маппинга контроллерами, без использования конфигурации в <code>web.xml</code>.<br>
2) <code>warSourceDirectory </code>должен ссылаться на папку, содержащую<code> WEB-INF/</code><br>
3) В конфигурации <code>maven</code>—<code>compiler</code>—<code>plugin</code> явно нужно прописать версию Java.<br>
Для запуска перейдите в конфигурацию сервера:</p>

<p style="max-width: 70%; text-align: center;"><img alt="" id="Рисунок_x0020_2" src="https://lh5.googleusercontent.com/QCbN9RnuFYJoLdEg-rkrg_fph9mg7LC1mVJGKhmk3rcDVuk1OLjLIqt3JvI_Q823uoUC99y34x0cv0T_rfcfgKoy_u8K3tiCNCZLF-s6XDlj9L7oQkCFJZBX0PoFtFReRQUs_c_s" style="max-width: 100%;"></p>

<p>Нажмите edit, затем плюс в левом верхнем углу и выберите Tomcat Server -&gt; Local Server.</p>

<p style="max-width: 70%; text-align: center;"><img alt="" id="Рисунок_x0020_1" src="https://lh5.googleusercontent.com/WIXIb9-WpoQnNYamC0mFTLFg2BhuOIWO3UV4x5FwZVU2YAGg2fYldatFERakFI89bhkpIVpw-UA1TeX4OfXo6mhwRobfm3z20D_gxW1yabksOY-R0umL2AzSkU2WGZ0WkDOjc76t" style="max-width: 100%;"></p>

<p>Настройте запуск приложения на свободный порт, выберите дефолтный Tomcat, измените адрес, который будет вызван после запуска, на <code>/</code>, так как в нашем приложении для этой страницы есть контроллер.<br>
Далее следует настроить артефакт. Нажмите кнопку Fix, далее «+», выберите артефакт с именем “название проекта”—war exploded.<br>
После этого подтвердите изменения и запускайте приложение.<br>
Ваш браузер откроется автоматически и вы увидите страницу приветствия.</p>

<p>Отдельное внимание стоит уделить тому, что в приложении нет метода main, его запуск происходит из-под Tomcat и для этого требуется отдельный класс <code>AppInit</code>, который ссылается на корневой конфигурационный файл и обозначает, на каком url будет находиться наше приложение.</p>

<p>&nbsp;</p>

<h3><span style="font-size:16px;"><strong>Задание:</strong></span></h3>

<p><br>
1.&nbsp;Создайте еще один контроллер, замаппленный на <code>/cars</code>.<br>
2.&nbsp;Создайте модель <code>Car</code> с тремя произвольными полями.<br>
3. Создайте список из 5 машин.<br>
4.&nbsp;Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.<br>
5.&nbsp;Создайте страницу <code>cars.html</code>. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.<br>
6.&nbsp;При запросе <code>/cars&nbsp;</code>выводить весь список. При запросе <code>/cars?count=2</code>&nbsp;должен отобразиться список из 2&nbsp;машин,<br>
при <code>/cars?count=3</code>&nbsp;- из 3, и тд. При <code>count</code> ≥ 5&nbsp;выводить весь список машин.</p>
