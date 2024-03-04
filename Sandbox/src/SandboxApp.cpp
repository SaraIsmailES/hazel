#include <Hazel.h>

class Sandbox : public Hazel::Application
{
public:
	Sandbox()
	{
	}

	~Sandbox()
	{
	}
};

int main()
{
	Sandbox* App = new Sandbox();
	App->Run();
	delete App;
}