var myApp = angular.module('myApp', []);

myApp.controller('myCtrl', function ($scope, $http) {
    $scope.message = "";
    $scope.error_mesage = "";

    //get all product
    $scope.getAllAcde = function () {
        $http({
            mehtod: "GET",
            url: 'http://localhost:8080/AngularJsProject/rest/acdes'
        }).then(
                function (response) {
                    $scope.acdes = response.data;
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    $scope.getAllAcde();


    //save Acde
    $scope.newAcde = {};
    $scope.saveAcde = function () {
        $http({
            method: "POST",
            url: 'http://localhost:8080/AngularJsProject/rest/acdes',
            data: angular.toJson($scope.newAcde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Academic Records Saved Successfully";
                    $scope.getAllAcde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };
    
    //Select product by click
    
    $scope.clickedAcde = {};
    $scope.selectAcde = function(acde){
        $scope.clickedAcde = acde;
    };
    $scope.updateAcde = function () {
        $http({
            method: "PUT",
            url: 'http://localhost:8080/AngularJsProject/rest/acdes/',
            data: angular.toJson($scope.clickedAcde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Academic Records Update Successfully";
                    $scope.getAllAcde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    //Delete Product
    $scope.deleteAcde = function () {
        $http({
            method: "DELETE",
            url: 'http://localhost:8080/AngularJsProject/rest/acdes/'+$scope.clickedAcde.id,
            data: angular.toJson($scope.newAcde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Academic Records Deleted Successfully";
                    $scope.getAllAcde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    //Clear message
    
    $scope.messageClose = function(){
        $scope.message = "";
    $scope.error_mesage = "";
    }



});
//Month Record
var myAp = angular.module('myAp', []);

myAp.controller('myCtrl', function ($scope, $http) {
    $scope.message = "";
    $scope.error_mesage = "";

    //get all product
    $scope.getAllMonth = function () {
        $http({
            mehtod: "GET",
            url: 'http://localhost:8080/AngularJsProject/rest/months'
        }).then(
                function (response) {
                    $scope.months = response.data;
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    $scope.getAllMonth();


    //save product
    $scope.newMonth = {};
    $scope.saveMonth = function () {
        $http({
            method: "POST",
            url: 'http://localhost:8080/AngularJsProject/rest/months',
            data: angular.toJson($scope.newMonth),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Trainee Record Saved Successfully";
                    $scope.getAllMonth();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };
    
    //Select product by click
    
    $scope.clickedMonth = {};
    $scope.selectMonth = function(monthr){
        $scope.clickedMonth = monthr;
    };
     $scope.updateMonth = function () {
        $http({
            method: "PUT",
            url: 'http://localhost:8080/AngularJsProject/rest/months/',
            data: angular.toJson($scope.clickedMonth),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Trainee Record Update Successfully";
                    $scope.getAllMonth();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };
    
    //Delete Product
    $scope.deleteMonth = function () {
        $http({
            method: "DELETE",
            url: 'http://localhost:8080/AngularJsProject/rest/months/'+$scope.clickedMonth.sl,
            data: angular.toJson($scope.newMonth),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Trainee Record Deleted Successfully";
                    $scope.getAllMonth();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    //Clear message
    
    $scope.messageClose = function(){
        $scope.message = "";
    $scope.error_mesage = "";
    }



});

//Personal Record
//var myApp = angular.module('myApp', []);
//
//myApp.controller('myCtrl', function ($scope, $http) {
//    $scope.message = "";
//    $scope.error_mesage = "";
//
//    //get all product
//    $scope.getAllAcde = function () {
//        $http({
//            mehtod: "GET",
//            url: 'http://localhost:8080/AngularJsProject/rest/acdes'
//        }).then(
//                function (response) {
//                    $scope.acdes = response.data;
//                },
//                function (reason) {
//                    $scope.error_message = reason.data;
//                }
//        );
//    };
//
//    $scope.getAllAcde();
//
//
//    //save Acde
//    $scope.newAcde = {};
//    $scope.saveAcde = function () {
//        $http({
//            method: "POST",
//            url: 'http://localhost:8080/AngularJsProject/rest/acdes',
//            data: angular.toJson($scope.newAcde),
//            headers: {
//                'Content-Type': 'application/json'
//            }
//        }).then(
//                function (response) {
//                    $scope.message = "Acde Saved Successfully";
//                    $scope.getAllAcde();
//                },
//                function (reason) {
//                    $scope.error_message = reason.data;
//                }
//        );
//    };
//    
//    //Select product by click
//    
//    $scope.clickedAcde = {};
//    $scope.selectAcde = function(acde){
//        $scope.clickedAcde = acde;
//    };
//    $scope.updateAcde = function () {
//        $http({
//            method: "PUT",
//            url: 'http://localhost:8080/AngularJsProject/rest/acdes/',
//            data: angular.toJson($scope.clickedAcde),
//            headers: {
//                'Content-Type': 'application/json'
//            }
//        }).then(
//                function (response) {
//                    $scope.message = "Acde Update Successfully";
//                    $scope.getAllAcde();
//                },
//                function (reason) {
//                    $scope.error_message = reason.data;
//                }
//        );
//    };
//
//    //Delete Product
//    $scope.deleteAcde = function () {
//        $http({
//            method: "DELETE",
//            url: 'http://localhost:8080/AngularJsProject/rest/acdes/'+$scope.clickedAcde.id,
//            data: angular.toJson($scope.newAcde),
//            headers: {
//                'Content-Type': 'application/json'
//            }
//        }).then(
//                function (response) {
//                    $scope.message = "Acde Deleted Successfully";
//                    $scope.getAllAcde();
//                },
//                function (reason) {
//                    $scope.error_message = reason.data;
//                }
//        );
//    };
//
//    //Clear message
//    
//    $scope.messageClose = function(){
//        $scope.message = "";
//    $scope.error_mesage = "";
//    }
//
//
//
//});
var myAppl = angular.module('myAppl', []);

myAppl.controller('myCtrl', function ($scope, $http) {
    $scope.message = "";
    $scope.error_mesage = "";

    //get all product
    $scope.getAllPerde = function () {
        $http({
            mehtod: "GET",
            url: 'http://localhost:8080/AngularJsProject/rest/perdes'
        }).then(
                function (response) {
                    $scope.perdes = response.data;
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    $scope.getAllPerde();


    //save product
    $scope.newPerde = {};
    $scope.savePerde = function () {
        $http({
            method: "POST",
            url: 'http://localhost:8080/AngularJsProject/rest/perdes',
            data: angular.toJson($scope.newPerde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Product Saved Successfully";
                    $scope.getAllPerde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };
    
    //Select product by click
    
    $scope.clickedPerde = {};
    $scope.selectPerde = function(perd){
        $scope.message = "Product Updated Successfully";
        $scope.clickedPerde = perd;
    };
     $scope.updatePerde = function () {
        $http({
            method: "PUT",
            url: 'http://localhost:8080/AngularJsProject/rest/perdes/',
            data: angular.toJson($scope.clickedPerde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Acde Update Successfully";
                    $scope.getAllPerde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };
    
    //Delete Product
    $scope.deletePerde = function () {
        $http({
            method: "DELETE",
            url: 'http://localhost:8080/AngularJsProject/rest/perdes/'+$scope.clickedPerde.id,
            data: angular.toJson($scope.newPerde),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Product Deleted Successfully";
                    $scope.getAllPerde();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    //Clear message
    
    $scope.messageClose = function(){
        $scope.message = "";
    $scope.error_mesage = "";
    }



});