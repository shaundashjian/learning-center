angular.module('course')
.component('courseList',{
	templateUrl : 'app/course/courseList/courseList.component.html',
	controller : function(){
		var vm = this;
		
		vm.courses = [{
			id : 1,
			name : 'Real Estate Concepts 1',
			nextStepNo : 1,
			progress : 0,
			dateStarted : '06/18/2017'
		}, {
			id : 2,
			name : 'Real Estate Concepts 2',
			nextStepNo : 1,
			progress : 0,
			dateStarted : '06/18/2017'
		}
		];
		
		vm.open = function(course){
			console.log(course);
		}
	},
	controllerAs : 'vm'
})