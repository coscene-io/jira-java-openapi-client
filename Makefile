# It's necessary to set this because some environments don't link sh -> bash.
SHELL := /usr/bin/env bash -o errexit -o pipefail -o nounset

GIT_DESCRIBE    := $(shell git describe --always --dirty)
GIT_COMMIT_DATE := $(shell git show -s --format="%ad" --date=format:"%Y%m%d" HEAD)
RELEASE_VERSION := $(shell echo "v${GIT_COMMIT_DATE}-${GIT_DESCRIBE}")

publish-jar:
	mvn versions:set -q -DnewVersion=${RELEASE_VERSION} && \
	mvn source:jar deploy
