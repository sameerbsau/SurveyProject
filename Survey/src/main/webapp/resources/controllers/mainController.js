 var app = angular.module("myApp", ["ui.router",'myApp.login','myApp.page2','myApp.survey']);

 app.config(function($stateProvider, $urlRouterProvider){
	 
	 $urlRouterProvider.otherwise('dashBoard');
	 $stateProvider.state({
			name: 'login',
			url: '/login',
			templateUrl:'resources/pages/login.html',
			controller:'loginController'
 }).state({
		name: 'productMaster',
		url: '/productMaster',
		templateUrl:'resources/pages/productmaster.html',
		/*controller:'loginController'*/
}).state({
	name: 'page2',
	url: '/page2',
	templateUrl:'resources/pages/page2.html',
	controller:'page2Controller'
}).state({
	name: 'dashBoard',
	url: '/dashBoard',
	templateUrl:'resources/pages/dashboard.html',
	/*controller:'page2Controller'*/
}).state({
	name: 'survey',
	url: '/survey',
	templateUrl:'resources/pages/surveys.html',
	controller:'surveyController'
});
 });
 
 app.controller('myCtrl',function(){
	 
 })
 
 
 