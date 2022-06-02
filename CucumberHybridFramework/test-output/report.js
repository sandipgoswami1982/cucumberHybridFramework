$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Adding new Customer in opencart application",
  "description": "",
  "id": "adding-new-customer-in-opencart-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14932854900,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Below steps are common",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user launch a chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user open an url \"http://localhost/opencart/upload/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter username as \"admin\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_launch_a_chrome_browser()"
});
formatter.result({
  "duration": 438605000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/opencart/upload/admin/",
      "offset": 18
    }
  ],
  "location": "StepDefinations.user_open_an_url(String)"
});
formatter.result({
  "duration": 1586043800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 24
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "StepDefinations.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 308469200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_login_button()"
});
formatter.result({
  "duration": 4046812600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 22972400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Adding new Customer",
  "description": "",
  "id": "adding-new-customer-in-opencart-application;adding-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user click on Customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on Customer menu item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on add new button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user can view Add Customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter new customer info",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user can view confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_click_on_Customers_menu()"
});
formatter.result({
  "duration": 2163865700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_Customer_menu_item()"
});
formatter.result({
  "duration": 1829016100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_add_new_button()"
});
formatter.result({
  "duration": 1072677900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_can_view_Add_Customer_page()"
});
formatter.result({
  "duration": 10214900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_enter_new_customer_info()"
});
formatter.result({
  "duration": 2998431200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_save_button()"
});
formatter.result({
  "duration": 3099360300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_can_view_confirmation_message()"
});
formatter.result({
  "duration": 49240200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "duration": 4199156200,
  "status": "passed"
});
formatter.before({
  "duration": 2614246300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "Below steps are common",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user launch a chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user open an url \"http://localhost/opencart/upload/admin/\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter username as \"admin\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_launch_a_chrome_browser()"
});
formatter.result({
  "duration": 528700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost/opencart/upload/admin/",
      "offset": 18
    }
  ],
  "location": "StepDefinations.user_open_an_url(String)"
});
formatter.result({
  "duration": 2627367600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 24
    },
    {
      "val": "admin",
      "offset": 48
    }
  ],
  "location": "StepDefinations.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 324886200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_login_button()"
});
formatter.result({
  "duration": 4173302800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 1600439100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "customer search by email",
  "description": "",
  "id": "adding-new-customer-in-opencart-application;customer-search-by-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user click on Customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on Customer menu item",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "enter customer email",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on filter button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user should found email in the search table",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_click_on_Customers_menu()"
});
formatter.result({
  "duration": 2114979400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_Customer_menu_item()"
});
formatter.result({
  "duration": 762036300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.enter_customer_email()"
});
formatter.result({
  "duration": 197286400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.click_on_filter_button()"
});
formatter.result({
  "duration": 904876800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_should_found_email_in_the_search_table()"
});
formatter.result({
  "duration": 50400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "duration": 164763900,
  "status": "passed"
});
});