**Don’t branch, PATCH!**
The work day is over and your pair is anchoring the story, but the code you’ve been working on all day is on your machine. While you should have been pushing consistently all day, sometimes that’s not possible because you have bizarre failing tests and heartbreak. You might be tempted to make a branch to get the code to your pair for the next day, but instead #PatchItToYourPair #ImSorry #ITried

******EASIEST METHOD******
  
_You can straight up patch (creating and applying) through IntelliJ: on top menu, go VCS > Create Patch… or Apply Patch… and follow instructions._

OR, you command line it:

**CREATING PATCH**  

* Before you patch, you need to git commit your changes
* DO NOT include “dist” or “bundle”  .js files in the commit!
* git format-patch -1 HEAD  
      * The patchName will be the commit message
* All commits that are ahead of master branch will be in the .patch file
* Your .patch file will appear in project directory
* Email the patch to your pair. 
* Remove patch from directory later so it doesn’t get pushed to codebase later.
* If you want a patch for every single commit: git format-patch master


**APPLYING PATCH**  
git apply --stat patchName.patch  
   * Looks at all changes in patch

git apply --check patchName.patch  
   * Sees if it will pose any merge problems -- know what you’re getting yourself into

git am --signoff < patchName.patch  
   * Applies the patch and provides signoff message about who applied the patch

