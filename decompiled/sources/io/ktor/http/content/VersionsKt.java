package io.ktor.http.content;

import f.AbstractC0847h;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "spec", "Lio/ktor/http/content/EntityTagVersion;", "EntityTagVersion", "(Ljava/lang/String;)Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/util/AttributeKey;", "", "Lio/ktor/http/content/Version;", "VersionListProperty", "Lio/ktor/util/AttributeKey;", "getVersionListProperty", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/OutgoingContent;", "value", "getVersions", "(Lio/ktor/http/content/OutgoingContent;)Ljava/util/List;", "setVersions", "(Lio/ktor/http/content/OutgoingContent;Ljava/util/List;)V", "versions", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VersionsKt {
    private static final AttributeKey<List<Version>> VersionListProperty;

    static {
        InterfaceC1444w interfaceC1444wB;
        InterfaceC1425d interfaceC1425dB = y.a.b(List.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            interfaceC1444wB = y.b(List.class, AbstractC0847h.q(y.a(Version.class)));
        } catch (Throwable unused) {
            interfaceC1444wB = null;
        }
        VersionListProperty = new AttributeKey<>("VersionList", new TypeInfo(interfaceC1425dB, interfaceC1444wB));
    }

    public static final EntityTagVersion EntityTagVersion(String str) {
        l.f("spec", str);
        return EntityTagVersion.INSTANCE.parseSingle(str);
    }

    public static final AttributeKey<List<Version>> getVersionListProperty() {
        return VersionListProperty;
    }

    public static final List<Version> getVersions(OutgoingContent outgoingContent) {
        l.f("<this>", outgoingContent);
        List<Version> list = (List) outgoingContent.getProperty(VersionListProperty);
        return list == null ? P3.y.f7779k : list;
    }

    public static final void setVersions(OutgoingContent outgoingContent, List<? extends Version> list) {
        l.f("<this>", outgoingContent);
        l.f("value", list);
        outgoingContent.setProperty(VersionListProperty, list);
    }
}
