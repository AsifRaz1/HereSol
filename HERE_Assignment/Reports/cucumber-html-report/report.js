$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/LinkVerification.feature");
formatter.feature({
  "name": "Finding the internal links of Documents section",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to Document page and find all the internal links and validate the links",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Application is launched in the Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.FindingTheInnerLinksOfDocumentSec.browserAndApplicationLaunch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page of HERE application is opened and click on document menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.FindingTheInnerLinksOfDocumentSec.navigateToDocumentPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the valid links and Validate the AngularJs load of the pages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.FindingTheInnerLinksOfDocumentSec.navigateAndCheckLinks()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GTA7F1B\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.163, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Asif\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:64869}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 8c790f8c42e312af7a62e67b78f0e997\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.window(RemoteWebDriver.java:903)\r\n\tat StepDefinition.FindingTheInnerLinksOfDocumentSec.testAngularLoad(FindingTheInnerLinksOfDocumentSec.java:83)\r\n\tat StepDefinition.FindingTheInnerLinksOfDocumentSec.navigateAndCheckLinks(FindingTheInnerLinksOfDocumentSec.java:103)\r\n\tat ✽.Validate the valid links and Validate the AngularJs load of the pages(file:///C:/Users/Asif/eclipse-workspace/HERE_Assignment/src/test/resources/FeatureFile/LinkVerification.feature:8)\r\n",
  "status": "failed"
});
});