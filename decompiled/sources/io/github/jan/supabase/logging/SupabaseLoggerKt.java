package io.github.jan.supabase.logging;

import e4.InterfaceC0821a;
import io.github.jan.supabase.SupabaseClient;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a*\u0010\b\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a*\u0010\t\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u001a*\u0010\n\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"d", "", "Lio/github/jan/supabase/logging/SupabaseLogger;", "throwable", "", ContentType.Message.TYPE, "Lkotlin/Function0;", "", "i", "w", "e", "supabase-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupabaseLoggerKt {
    public static final void d(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static /* synthetic */ void d$default(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static final void e(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.ERROR;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static /* synthetic */ void e$default(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.ERROR;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static final void i(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.INFO;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static /* synthetic */ void i$default(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.INFO;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static final void w(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.WARNING;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public static /* synthetic */ void w$default(SupabaseLogger supabaseLogger, Throwable th, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        l.f("<this>", supabaseLogger);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel logLevel = LogLevel.WARNING;
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }
}
