function fn() {
    var env = karate.env;
    if (!env) {
        env = 'dev';
    }
    karate.log('Tests will be executed in', env, 'environment');

    var config = {
        appBaseURL: 'https://reqres.in/api/'
    };

    if (env == 'e2e') {

        config.appBaseURL = 'https://stage-host/v1/auth';
    }
    return config;
}