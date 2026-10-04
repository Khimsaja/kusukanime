package io.github.jan.supabase.logging;

import D6.r;
import R2.d;
import R2.e;
import R2.g;
import R2.h;
import R2.i;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0003H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/logging/KermitSupabaseLogger;", "Lio/github/jan/supabase/logging/SupabaseLogger;", "level", "Lio/github/jan/supabase/logging/LogLevel;", "tag", "", "logger", "Lco/touchlab/kermit/Logger;", "<init>", "(Lio/github/jan/supabase/logging/LogLevel;Ljava/lang/String;Lco/touchlab/kermit/Logger;)V", "getLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "log", "", "throwable", "", ContentType.Message.TYPE, "toSeverity", "Lco/touchlab/kermit/Severity;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KermitSupabaseLogger extends SupabaseLogger {
    private final LogLevel level;
    private final h logger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KermitSupabaseLogger(LogLevel logLevel, String str, h hVar) {
        l.f("level", logLevel);
        l.f("tag", str);
        l.f("logger", hVar);
        this.level = logLevel;
        this.logger = hVar;
        d dVar = (d) hVar.f8011k;
        i severity = toSeverity(getLevel());
        l.f("value", severity);
        synchronized (dVar) {
            dVar.a = severity;
        }
    }

    private final i toSeverity(LogLevel logLevel) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i7 == 1) {
            return i.f8091l;
        }
        if (i7 == 2) {
            return i.f8092m;
        }
        if (i7 == 3) {
            return i.f8093n;
        }
        if (i7 == 4) {
            return i.f8094o;
        }
        if (i7 == 5) {
            return i.f8095p;
        }
        throw new r();
    }

    @Override // io.github.jan.supabase.logging.SupabaseLogger
    public LogLevel getLevel() {
        return this.level;
    }

    @Override // io.github.jan.supabase.logging.SupabaseLogger
    public void log(LogLevel level, Throwable throwable, String message) {
        l.f("level", level);
        l.f(ContentType.Message.TYPE, message);
        h hVar = this.logger;
        i severity = toSeverity(level);
        String strL0 = this.logger.L0();
        if (((d) hVar.f8011k).a.compareTo(severity) <= 0) {
            l.f("severity", severity);
            l.f("tag", strL0);
            for (e eVar : ((d) hVar.f8011k).f8087b) {
                eVar.getClass();
                eVar.a(severity, message, strL0, throwable);
            }
        }
    }

    public KermitSupabaseLogger(LogLevel logLevel, String str, h hVar, int i7, f fVar) {
        if ((i7 & 4) != 0) {
            g gVar = h.f8088m;
            gVar.getClass();
            l.f("tag", str);
            hVar = new h((d) gVar.f8011k, str);
        }
        this(logLevel, str, hVar);
    }
}
