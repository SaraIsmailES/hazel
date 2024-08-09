#pragma once

#include <memory>

#include "Core.h"
#include "spdlog/spdlog.h"
#include "spdlog/fmt/ostr.h"


namespace Hazel {

	class HAZEL_API Log
	{
	public:
		static void Init();

		inline static std::shared_ptr<spdlog::logger>& GetCorelogger() { return s_CoreLogger; }
		inline static std::shared_ptr<spdlog::logger>& GetClientlogger() { return s_ClientLogger; }

	private:
		static std::shared_ptr<spdlog::logger> s_CoreLogger;
		static std::shared_ptr<spdlog::logger> s_ClientLogger;

	};

}

// Core log macros
#define HZ_CORE_TRACE(...)      ::Hazel::Log::GetCorelogger()->trace(__VA_ARGS__)
#define HZ_CORE_INFO(...)       ::Hazel::Log::GetCorelogger()->info(__VA_ARGS__)
#define HZ_CORE_WARN(...)       ::Hazel::Log::GetCorelogger()->warn(__VA_ARGS__)
#define HZ_CORE_ERROR(...)      ::Hazel::Log::GetCorelogger()->error(__VA_ARGS__)
#define HZ_CORE_FATAL(...)      ::Hazel::Log::GetCorelogger()->fatal(__VA_ARGS__)


// Client log macros
#define HZ_TRACE(...)      ::Hazel::Log::GetClientlogger()->trace(__VA_ARGS__)
#define HZ_INFO(...)       ::Hazel::Log::GetClientlogger()->info(__VA_ARGS__)
#define HZ_WARN(...)       ::Hazel::Log::GetClientlogger()->warn(__VA_ARGS__)
#define HZ_ERROR(...)      ::Hazel::Log::GetClientlogger()->error(__VA_ARGS__)
#define HZ_FATAL(...)      ::Hazel::Log::GetClientlogger()->fatal(__VA_ARGS__)