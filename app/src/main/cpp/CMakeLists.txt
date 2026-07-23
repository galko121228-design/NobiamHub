cmake_minimum_required(VERSION 3.10)

project(nobiamhub CXX)

set(CMAKE_BUILD_TYPE RelWithDebInfo CACHE STRING "Build type" FORCE)
set(BUILD_SHARED_LIBS ON CACHE BOOL "Build shared libraries" FORCE)

if(ANDROID)
    set(CMAKE_POSITION_INDEPENDENT_CODE ON)
    add_link_options("-Wl,-z,max-page-size=16384")
endif()

# Оставляем только существующую папку с кодом
add_subdirectory(inbuiltmods)
