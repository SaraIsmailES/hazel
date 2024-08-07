#pragma once

#include <stdio.h>
#include "Application.h"

#ifdef HZ_PLATFORM_WINDOWS

extern Hazel::Application* Hazel::CreateApplication();

int main(int argc, char** arv)
{
	printf("Hiiii from Engine!!!!!!!!!!");
	
	auto app = Hazel::CreateApplication();
	app->Run();
	delete app;
}

#endif
