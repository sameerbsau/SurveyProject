var survey = angular.module('myApp.survey', []);

survey.controller('surveyController', function($scope, $http, $state) {
	$scope.fetchSurveyTypeList = function() {
		var surveyListObj = {
			url : 'surveyTypes',
			method : 'GET'
		}
		$http(surveyListObj).then(function(reponse) {
			$scope.surveyListData = reponse.data;
		}, function error(response) {
			$scope.surveyListData = reponse.statusText;
		});

	}//function
	
	/*new function for service*/
	$scope.saveSurveyData = function (obj) {

        var dataObj = { url: 'saveSurveyData', method: 'POST', headers: { 'Content-Type': 'application/json' }, data: obj }
        $http(dataObj)
            .then(function (response) {

                $scope.datum = response.data;
                alert( $scope.datum );
               /* if($scope.datum.key=="success"){
               	 $state.go("productMaster");
                }*/
                
                

            }, function myError(response) {

                $scope.datum = response.statusText;
            });
	 }

})
