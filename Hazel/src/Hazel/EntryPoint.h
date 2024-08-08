#pragma once

#include "Application.h"

#ifdef HZ_PLATFORM_WINDOWS

extern Hazel::Application* Hazel::CreateApplication();

int main(int argc, char** arv)
{
	Hazel::Log::Init();
	HZ_CORE_WARN("coreeeeeeee warn log!!!");

	int a = 5;
	float b = 3.33;
	HZ_INFO("hi inttt {0} , float {1}", a, b);
	auto app = Hazel::CreateApplication();
	app->Run();
	delete app;
}

#endif
