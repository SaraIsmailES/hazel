#include "Application.h"

#include "Events/ApplicationEvent.h"
#include "Hazel/Log.h"


namespace Hazel
{
	Application::Application()
	{}

	Application::~Application()
	{}

	void Application::Run()
	{
		WindowResizeEvent e(1280, 720);

		if (e.IsInCategory(EventCategoryApplication))
		{
			HZ_TRACE(e.GetWidth());
			HZ_TRACE("EventCategoryApplication");
		}
		if (e.IsInCategory(EventCategoryInput))
		{
			HZ_TRACE(e.GetHeight());
			HZ_TRACE("EventCategoryInput");
		}

		while (true)
		{

		}
	}

}

