package io.ktor.http;

import O3.i;
import P3.F;
import P3.q;
import P3.r;
import P3.y;
import io.ktor.http.ContentType;
import io.ktor.util.CharsetKt;
import io.ktor.util.CollectionsKt;
import io.ktor.util.TextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y5.h;
import y5.k;
import z5.AbstractC2510o;
import z5.C2496a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u001a\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"-\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"-\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "extension", "Lio/ktor/http/ContentType;", "defaultForFileExtension", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Lio/ktor/http/ContentType;", "path", "defaultForFilePath", "", "fromFilePath", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Ljava/util/List;", "ext", "fromFileExtension", "fileExtensions", "(Lio/ktor/http/ContentType;)Ljava/util/List;", "selectDefault", "(Ljava/util/List;)Lio/ktor/http/ContentType;", "", "matchApplicationTypeWithCharset", "(Lio/ktor/http/ContentType;)Z", "withCharsetUTF8IfNeeded", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentType;", "A", "B", "Ly5/h;", "LO3/l;", "", "groupByPairs", "(Ly5/h;)Ljava/util/Map;", "toContentType", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "contentTypesByExtensions$delegate", "LO3/i;", "getContentTypesByExtensions", "()Ljava/util/Map;", "contentTypesByExtensions", "extensionsByContentType$delegate", "getExtensionsByContentType", "extensionsByContentType", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileContentTypeKt {
    private static final i contentTypesByExtensions$delegate = z1.c.C(new c(7));
    private static final i extensionsByContentType$delegate = z1.c.C(new c(8));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map contentTypesByExtensions_delegate$lambda$1() {
        Map mapCaseInsensitiveMap = CollectionsKt.caseInsensitiveMap();
        mapCaseInsensitiveMap.putAll(groupByPairs(q.l0(MimesKt.getMimes())));
        return mapCaseInsensitiveMap;
    }

    public static final ContentType defaultForFileExtension(ContentType.Companion companion, String str) {
        l.f("<this>", companion);
        l.f("extension", str);
        return selectDefault(fromFileExtension(ContentType.INSTANCE, str));
    }

    public static final ContentType defaultForFilePath(ContentType.Companion companion, String str) {
        l.f("<this>", companion);
        l.f("path", str);
        return selectDefault(fromFilePath(ContentType.INSTANCE, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map extensionsByContentType_delegate$lambda$3() {
        return groupByPairs(k.U(q.l0(MimesKt.getMimes()), new io.ktor.client.request.a(17)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O3.l extensionsByContentType_delegate$lambda$3$lambda$2(O3.l lVar) {
        l.f("<destruct>", lVar);
        return new O3.l((ContentType) lVar.f7529l, (String) lVar.f7528k);
    }

    public static final List<String> fileExtensions(ContentType contentType) {
        l.f("<this>", contentType);
        List<String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        List<String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? y.f7779k : list2;
    }

    public static final List<ContentType> fromFileExtension(ContentType.Companion companion, String str) {
        l.f("<this>", companion);
        l.f("ext", str);
        for (String lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(AbstractC2510o.o0(str, ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = AbstractC2510o.B0(lowerCasePreservingASCIIRules, ".", "")) {
            List<ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return y.f7779k;
    }

    public static final List<ContentType> fromFilePath(ContentType.Companion companion, String str) {
        l.f("<this>", companion);
        l.f("path", str);
        int iD0 = AbstractC2510o.d0(str, '.', AbstractC2510o.k0(str, CharsetKt.toCharArray("/\\"), AbstractC2510o.b0(str)) + 1, 4);
        if (iD0 == -1) {
            return y.f7779k;
        }
        String strSubstring = str.substring(iD0 + 1);
        l.e("substring(...)", strSubstring);
        return fromFileExtension(companion, strSubstring);
    }

    private static final Map<String, List<ContentType>> getContentTypesByExtensions() {
        return (Map) contentTypesByExtensions$delegate.getValue();
    }

    private static final Map<ContentType, List<String>> getExtensionsByContentType() {
        return (Map) extensionsByContentType$delegate.getValue();
    }

    public static final <A, B> Map<A, List<B>> groupByPairs(h hVar) {
        l.f("<this>", hVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVar) {
            Object obj2 = ((O3.l) obj).f7528k;
            Object arrayList = linkedHashMap.get(obj2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(obj2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.I(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r.p(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((O3.l) it.next()).f7529l);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    private static final boolean matchApplicationTypeWithCharset(ContentType contentType) {
        ContentType.Application application = ContentType.Application.INSTANCE;
        if (contentType.match(application.getAny())) {
            return contentType.match(application.getAtom()) || contentType.match(application.getJavaScript()) || contentType.match(application.getRss()) || contentType.match(application.getXml()) || contentType.match(application.getXml_Dtd());
        }
        return false;
    }

    public static final ContentType selectDefault(List<ContentType> list) {
        l.f("<this>", list);
        ContentType octetStream = (ContentType) q.t0(list);
        if (octetStream == null) {
            octetStream = ContentType.Application.INSTANCE.getOctetStream();
        }
        return octetStream.match(ContentType.Text.INSTANCE.getAny()) ? withCharsetUTF8IfNeeded(octetStream) : octetStream.match(ContentType.Image.INSTANCE.getSVG()) ? withCharsetUTF8IfNeeded(octetStream) : matchApplicationTypeWithCharset(octetStream) ? withCharsetUTF8IfNeeded(octetStream) : octetStream;
    }

    public static final ContentType toContentType(String str) {
        l.f("<this>", str);
        try {
            return ContentType.INSTANCE.parse(str);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Failed to parse ".concat(str), th);
        }
    }

    private static final ContentType withCharsetUTF8IfNeeded(ContentType contentType) {
        return ContentTypesKt.charset(contentType) != null ? contentType : ContentTypesKt.withCharset(contentType, C2496a.f19036b);
    }
}
