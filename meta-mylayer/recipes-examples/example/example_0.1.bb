SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

python do_build() {
    bb.plan("********************************************");
    bb.plan("*                                          *");
    bb.plan("* Example recipe created by bitbake-layers *");
    bb.plan("*                                          *");
    bb.plan("********************************************");
}
