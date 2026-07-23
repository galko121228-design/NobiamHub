cmake_minimum_required(VERSION 3.10)

project(inbuiltmods CXX)

add_library(inbuiltmods SHARED
    src/common/transition.cpp
    # Временно отключаем проблемные моды
    # src/fps/fps.cpp
    # src/snaplook/snaplook.cpp
    # src/zoom/zoom.cpp
)

target_include_directories(inbuiltmods PRIVATE src)
