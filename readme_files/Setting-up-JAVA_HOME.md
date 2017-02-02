0. *IMPORTANT*: Ensure your JAVA_HOME variable is defined and pointing to Java SDK version 1.8 in your `.bash_profile`
    
    - Install Java 8 with `$ brew cask install java`
    
    - Ensure in your `.bash_profile` (or `.zshrc` if you use ZSH) points JAVA_HOME to version 1.8
    
        - You can use vim or your preferred text editor to add the following lines to your `~/.bash_profile` file
            - This makes JAVA_HOME point to 1.8
            `export JAVA_HOME=$(/usr/libexec/java_home –v 1.8)`
            - This adds Postgres to your path
            `export PATH=$PATH:/Applications/Postgres.app/Contents/Versions/latest/bin`

    - Run this command to load your profile:
        - `$ source ~/.bash_profile` OR
        - `$ source ~/.zshrc`  