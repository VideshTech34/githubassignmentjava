//GitHub Assignment

1. How to check if git is available in your system?
Ans-> We use this command to check the git is available in our system.
 git --version

2.How to intialize a new Git repository?
Ans-> To initilize a new repository in our system we use this command.
 git init

3. How to tell git about your name and mail?
Ans-> to set the username and email we use these command
>git config --global user.name "Videsh"
> git config --global user.email "videsh5655@gmail.com"

global
* it indicates the user can work with git commands from different drives of the computer

4.How to add a file to the staging area ?
Ans-> To add the file to the staging area we use mainly this command.
 git add .

5.How to remove a file from staging area?
Ans-> you can unstage files recursively by directory and so forth, so to unstage everything at once, 
run this from the root directory of your repository:
git reset HEAD -- 

6. How to make a commit?
Ans->The commit command will commit the changes and generate a commit-id. The commit command without any argument will open the default text editor and ask for the commit message.
 We can specify our commit message in this text editor
git commit - m "message"

7. How to send your change to remote repository?
Ans-> We use git push to push commits made on your local branch to a remote repository.
git push REMOTE-NAME BRANCH-NAME

8. What is the difference between clone and pull?
Ans->
git clone
1. Used to set up a local repository.	
2. Make a copy of your remote repository and save it to your local machine
3. . Used once in a project.
git pull
1  Used to sync remote and local repositories.
2. Fetch and merge the latest changes from a remote repository to your local repository.
3. Used several times in a project.