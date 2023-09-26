<h1 align="center"> Проект автоматизации тестов для Dats Team <img src="https://github.com/Toalra/HomeWork15/blob/master/media/logs/logo.svg" wight="35" height="35"/></h1>
<h2>Содержание</h2>
<h2 tabindex="-1" id="user-content-computer-использованный-стек-технологий" dir="auto">Использованные инструменты</h2>
  <a class="heading-link" href="#computer-использованный-стек-технологий"></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/AllureTestOps.svg"><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/AllureTestOps.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Allure_Report.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Allure_Report.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/GitHub.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/GitHub.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Gradle.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Gradle.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Intelij_IDEA.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Intelij_IDEA.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/JUnit5.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/JUnit5.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Java.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Java.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jenkins.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jenkins.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Selenide.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Selenide.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Selenoid.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Selenoid.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Telegram.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Telegram.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jira.svg"><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jira.svg" wight="40" height="40"/></a>

* Проект автотестов для компаниия Dats Team написан на языке `Java` с применением фреймворка для автотестирования `Selenide` и `JUnit 5`.
* Для автоматической сборки автотестов был использован `Gradle`.
* Во время прогона автотестов применялся сервер `Selenoid`.
* Для реадизации удаленного запуска применялся `Jenkins` с формированием отчета в `Allure`.
* Краткие отчеты с результатами тестирования отправлятся в `Telegram` с использованием бота.
* Применена интеграция с `Allure TestOps` и `Jira`

В отчет `Allure` входит:
* Описанные шаги тестов;
* Скриншот страницы результата на последнем шаге;
* Page Source;
* Логи консоли браузера;
* Видео с выполнением автотеста.

<h2>Реализованные проверки</h2>

* Проверка открытия верных страниц по разделам сайта
* Проверка заполнения формы "Расскажите о себе"
* Проверка открытия страницы `dats.games`

<h2>Запуск автотестов</h2>
<h3>Запуск автотестов из терминала</h3>
При выполнении команды в терминале IntelliJ IDEA, тесты запустятся в удаленном браузере в `Selenoid`

```
gradle clean first_test
```

<h3>Запуск тестов на удаленном барузере</h3>
Автотеты можно запустить также терминал на удаленном браузере

```
gradle clean test -Denv=main
```

Запуск автотестов при переопределенных параметров запуска
```
clean
main -DremoteUrl=${SELENOID_URL}
-DbaseUrl=${BASE_URL}
-DbrowserSize=${BROWSER_SIZE}
-Dbrowser=${BROWSER_NAME}
-Dbrowser_version="${BROWSER_VERSION}"
```

<h3>Параметры сборок</h3>

* `BROWSER_NAME` – браузер для выполнения автотестов. По-умолчанию - chrome.
* `BROWSER_VERSION` – версия браузера для выполнения автотестов. По-умолчанию - 100.0.
* `BROWSER_SIZE` – размер окна браузера. По-умолчанию - 1920x1080.
* `BASE_URL` – web-адрес тестируемого приложения.
* `REMOTE_BROWSER_URL`  – адрес удаленного сервера для запуска автотестов.

<h2><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jenkins.svg" wight="30" height="30"/>  Сборка в Jenkins</h2>
<a title="jenkinsReport"><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/jenkinsReport.png" wight="500" height="500"/></a>
<h3>Overwies</h3>
<a href=""><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/AllureReport.png" wight="500" height="500"/></a>

<h3>Результат выполнения теста</h3>
<a title="allureResults"><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/allureResults.png" wight=800" height="390"/></a>
<h2><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/AllureTestOps.svg" wight="30" height="30"/>  Интеграция с Allure TestOps </h2>

Сборка имеет интеграцию `Jenkins` с `Allure TestOps`. Результат выполнения автотестов отображается в `Allure TestOps` на `Dashboard` в `Allure TestOps` отображена статистика пройденных тестов.
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/testOpsReults.png" wight="900" height="550"/>

<h2><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Jira.svg" wight="30" height="30"/>  Интеграция с Jira</h2>

Выполнена интеграция `Allure TestOps` с `Jira`, в тикете отображается список автотестов и результаты их прогода.
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/jiraResults.png" wight="900" height="500"/>

<h2><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Telegram.svg" wight="30" height="30"/>  Краткий отчет в Telegram</h2>

После прогона их `Jenkins` в `Telegram` отправляется уведомление с кратким отчетом результатов пройденного тестирования.
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/tgResults.png" wight="500" height="500"/>

<h2>Видео  примером запуска</h2>

С помощью видео в `Allure Jenkins` можно увидеть прохождение автотеста 
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/video/fillForm.gif" wight="500" height="500"/>
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/video/gamePage.gif" wight="500" height="500"/>
