# Wizard DS #

### Step 1 [settings.gradle]: Add it in your root build.gradle at the end of repositories: ###

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

### Step 2 [build.gradle]: Add the dependency ###

	dependencies {
	        implementation 'com.github.touche-time:wizard-ds:Tag'
	}

### Current Version: 0.0.1 ###
