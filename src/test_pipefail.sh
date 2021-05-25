#!/bin/bash
set -e
function test {
  arg="$1"
  set -o pipefail
  set +o pipefail
  set -o pipefail
  if [[ $arg -eq 5 ]]; then
    cat .fffffff | cat - || exit 255
  fi 
  echo "arg is $arg"
}
export -f test
for i in {1..100}; do echo $i; done | xargs -n1 -P 5 -I '{}' bash -c 'test {}'
