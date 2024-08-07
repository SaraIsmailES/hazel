#pragma once

#include <memory>

#include "Core.h"
#include "spdlog/spdlog.h"

namespace Hazel {

	class HAZEL_API Log
	{
	public:
		static void Init();

		inline static std::shared_ptr<spdlog::logger>& GetCorelogger() { return s_CoreLogger; }


	private:
		static std::shared_ptr<spdlog::logger> s_CoreLogger;
		static std::shared_ptr<spdlog::logger> s_ClientLogger;

	};

}

