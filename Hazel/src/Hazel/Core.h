#pragma once


#ifdef HZ_PLATFORM_WINDOWS 
	#ifdef HZ_BUILD_DLL
		#define HAZEL_API __declspec(dllexport)
	#else 
		#define HAZEL_API __declspec(dllimport)
#endif

#define BIT(x) (1 << x)

#else 
	#error Hazel Only Support Windows
#endif

