#!/bin/bash
find . -regex ".*\.\(garry\|game\|ludo\|bl\|junta\)" | xargs -I '{}'  pygmentize -f latex -l ludo -o {}.tex {}
#  pygmentize -f latex -l ludo -o "$1.tex" "$1"
