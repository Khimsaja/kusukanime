package io.github.jan.supabase.logging;

import e4.InterfaceC0821a;
import io.github.jan.supabase.SupabaseClient;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J.\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH\u0086\bø\u0001\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/logging/SupabaseLogger;", "", "<init>", "()V", "level", "Lio/github/jan/supabase/logging/LogLevel;", "getLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "log", "", "throwable", "", ContentType.Message.TYPE, "", "Lkotlin/Function0;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SupabaseLogger {
    public static /* synthetic */ void log$default(SupabaseLogger supabaseLogger, LogLevel logLevel, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i7 & 2) != 0) {
            th = null;
        }
        supabaseLogger.log(logLevel, th, str);
    }

    public abstract LogLevel getLevel();

    public final void log(LogLevel logLevel, Throwable th, InterfaceC0821a interfaceC0821a) {
        l.f("level", logLevel);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel level = getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }

    public abstract void log(LogLevel level, Throwable throwable, String message);

    public static /* synthetic */ void log$default(SupabaseLogger supabaseLogger, LogLevel logLevel, Throwable th, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i7 & 2) != 0) {
            th = null;
        }
        l.f("level", logLevel);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        LogLevel level = supabaseLogger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            supabaseLogger.log(logLevel, th, (String) interfaceC0821a.invoke());
        }
    }
}
