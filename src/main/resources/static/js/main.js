require.config ({
	
	paths: {
		'angular': '/lib/angular/angular',
		'jquery' : '/lib/jquery/dist/jquery',
		'app': 'app',
	},
	
	shim: {
		'angular': {
			deps: ['jquery']
		},
		
		'app': {
			deps: ['angular']
		},
	}
	
});

require(['app'], function(){
	angular.bootstrap(document, ['app']);
});