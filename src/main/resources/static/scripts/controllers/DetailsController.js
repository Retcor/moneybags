/**
 * Created by daniel.baker on 3/1/2015.
 */
(function(){
    var app = angular.module("moneybags");
    var detailsController = function($scope, $rootScope, details) {
        $scope.user = $rootScope.user;
        $scope.userDebts = details.getDebts($rootScope.user.id);
        $scope.userExpenses = details.getExpenses($rootScope.user.id);

        var saveSuccess = function(data) {
            $scope.Message = "Save Success!";
        };

        $scope.saveDebt = function (description, payAmount, dueDate, rate, totalLeft) {
            var debtObj = {
                userId: $rootScope.user.id,
                description: description,
                payAmount: payAmount,
                dueDate: dueDate,
                rate: rate,
                totalLeft: totalLeft
            };
            details.saveDebt(debtObj).then(saveSuccess,saveError);
        };
        $scope.saveExpense = function () {

        }
    };
    app.controller('DetailsController', detailsController);
}());