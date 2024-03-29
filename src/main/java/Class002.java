package main.java;
//ewwefwefewreverberbe
public class Class002 {
    public static void main(String[] args) {
        System.out.println("If <branch> is specified  git rebase will perform an automatic git switch <branch> before doing anything else. Otherwise it remains on the current branch.\n" +
                "\n" +
                "If <upstream> is not specified, the upstream configured in branch.<name>.remote and branch.<name>.merge options will be used (see git-config[1] for details) and the --fork-point option is assumed. If you are currently not on any branch or if the current branch does not have a configured upstream, the rebase will abort.");

        System.out.println("All changes made by commits in the current branch but that are not in <upstream> are saved to a temporary area. This is the same set of commits that would be shown by git log <upstream>..HEAD; or by git log 'fork_point'..HEAD, if --fork-point is active (see the description on --fork-point below); or by git log HEAD, if the --root option is specified.\n" +
                "\n" +
                "The current branch is reset to <upstream>, or <newbase> if the --onto option was supplied. This has the exact same effect as git reset --hard <upstream> (or <newbase>). ORIG_HEAD is set to point at the tip of the branch before the reset.");
    }
}
