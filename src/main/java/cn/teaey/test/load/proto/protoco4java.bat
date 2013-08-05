echo off
set "EXEC=protoc.exe"
set "PROTO_DIR=./"
set "OUTPUT_ROOT=../../../../../
%EXEC% --java_out=%OUTPUT_ROOT% --proto_path=%PROTO_DIR% %PROTO_DIR%/*.proto
@pause