package io.github.jan.supabase;

import A6.b;
import J3.a;
import O3.i;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z1.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/OSInformation;", "", ContentDisposition.Parameters.Name, "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OSInformation {
    private final String name;
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i CURRENT$delegate = c.C(new a(10));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/OSInformation$Companion;", "", "<init>", "()V", "CURRENT", "Lio/github/jan/supabase/OSInformation;", "getCURRENT", "()Lio/github/jan/supabase/OSInformation;", "CURRENT$delegate", "Lkotlin/Lazy;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final OSInformation getCURRENT() {
            return (OSInformation) OSInformation.CURRENT$delegate.getValue();
        }

        private Companion() {
        }
    }

    public OSInformation(String str, String str2) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("version", str2);
        this.name = str;
        this.version = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OSInformation CURRENT_delegate$lambda$0() {
        try {
            return PlatformTarget_androidKt.getOSInformation();
        } catch (Exception e7) {
            SupabaseLogger logger = SupabaseClient.INSTANCE.getLOGGER();
            LogLevel logLevel = LogLevel.ERROR;
            LogLevel level = logger.getLevel();
            if (level == null) {
                level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level) < 0) {
                return null;
            }
            logger.log(logLevel, e7, "Failed to get OS information, please report this issue");
            return null;
        }
    }

    public static /* synthetic */ OSInformation copy$default(OSInformation oSInformation, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = oSInformation.name;
        }
        if ((i7 & 2) != 0) {
            str2 = oSInformation.version;
        }
        return oSInformation.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final OSInformation copy(String name, String version) {
        l.f(ContentDisposition.Parameters.Name, name);
        l.f("version", version);
        return new OSInformation(name, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OSInformation)) {
            return false;
        }
        OSInformation oSInformation = (OSInformation) other;
        return l.a(this.name, oSInformation.name) && l.a(this.version, oSInformation.version);
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OSInformation(name=");
        sb.append(this.name);
        sb.append(", version=");
        return b.j(sb, this.version, ')');
    }
}
