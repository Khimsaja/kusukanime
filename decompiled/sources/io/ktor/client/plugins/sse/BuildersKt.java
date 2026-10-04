package io.ktor.client.plugins.sse;

import H5.C0276q;
import H5.D;
import O3.C;
import e4.k;
import e4.n;
import f.AbstractC0847h;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.URLParserKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aL\u0010\u0012\u001a\u00020\u000f*\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a~\u0010\u0012\u001a\u00020\u000f*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001aV\u0010\u0012\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001ap\u0010$\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b\"\u0010#\u001a¢\u0001\u0010$\u001a\u00020\u0003*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b%\u0010&\u001az\u0010$\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b'\u0010(\u001aL\u0010*\u001a\u00020\u000f*\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b)\u0010\u0011\u001a~\u0010*\u001a\u00020\u000f*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b+\u0010\u001a\u001aV\u0010*\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b,\u0010\u001d\u001ap\u0010.\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b-\u0010#\u001a¢\u0001\u0010.\u001a\u00020\u0003*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b/\u00100\u001az\u0010.\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b1\u00102\u001ah\u0010\u0012\u001a\u000205*\u00020\u00072\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u001c\u00106\u001a\u009a\u0001\u0010\u0012\u001a\u000205*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b7\u00108\u001ar\u0010\u0012\u001a\u000205*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b9\u0010:\u001a\u008c\u0001\u0010$\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b;\u0010<\u001a¾\u0001\u0010$\u001a\u00020\u0003*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b=\u0010>\u001a\u0096\u0001\u0010$\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b?\u0010@\u001ah\u0010*\u001a\u000205*\u00020\u00072\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b,\u00106\u001a\u009a\u0001\u0010*\u001a\u000205*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\bA\u00108\u001ar\u0010*\u001a\u000205*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\bB\u0010:\u001a\u008c\u0001\u0010.\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\b1\u0010<\u001a¾\u0001\u0010.\u001a\u00020\u0003*\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\bC\u0010D\u001a\u0096\u0001\u0010.\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00132\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0086@¢\u0006\u0004\bE\u0010F\u001ab\u0010K\u001a\u00028\u0000\"\u0006\b\u0000\u0010G\u0018\u0001*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0082H¢\u0006\u0004\bI\u0010J\u001a5\u0010O\u001a\u00020\u0003\"\b\b\u0000\u0010G*\u00020!*\u00020\r2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\b\u0010N\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\bO\u0010P\u001a!\u0010U\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010V\" \u0010W\u001a\b\u0012\u0004\u0012\u00020\n0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\" \u0010[\u001a\b\u0012\u0004\u0012\u00020\b0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010Z\" \u0010]\u001a\b\u0012\u0004\u0012\u00020\n0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010Z\" \u0010_\u001a\b\u0012\u0004\u0012\u00020\n0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010Z\"4\u0010a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010!0\u001f0L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010X\u001a\u0004\bb\u0010Z¨\u0006c"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/sse/SSEConfig;", "LO3/C;", "config", "SSE", "(Lio/ktor/client/HttpClientConfig;Le4/k;)V", "Lio/ktor/client/HttpClient;", "LA5/a;", "reconnectionTime", "", "showCommentEvents", "showRetryEvents", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/sse/ClientSSESession;", "serverSentEventsSession-i8z2VEo", "(Lio/ktor/client/HttpClient;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "serverSentEventsSession", "", "scheme", "host", "", "port", "path", "serverSentEventsSession-xEWcMm4", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "urlString", "serverSentEventsSession-mY9Nd3A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "LS3/c;", "", "serverSentEvents-mY9Nd3A", "(Lio/ktor/client/HttpClient;Le4/k;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "serverSentEvents", "serverSentEvents-1wIb-0I", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "serverSentEvents-3bFjkrY", "(Lio/ktor/client/HttpClient;Ljava/lang/String;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "sseSession-i8z2VEo", "sseSession", "sseSession-xEWcMm4", "sseSession-mY9Nd3A", "sse-mY9Nd3A", "sse", "sse-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "sse-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/k;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "deserialize", "Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "(Lio/ktor/client/HttpClient;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "serverSentEventsSession-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "serverSentEventsSession-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;LS3/c;)Ljava/lang/Object;", "serverSentEvents-Mswn-_c", "(Lio/ktor/client/HttpClient;Le4/k;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "serverSentEvents-BqdlHlk", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "serverSentEvents-pTj2aPc", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "sseSession-tL6_L-A", "sseSession-Mswn-_c", "sse-BAHpl2s", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "sse-Q9yt8Vw", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/k;Le4/n;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/n;LS3/c;)Ljava/lang/Object;", "T", "additionalAttributes", "processSession-rp2poPw", "(Lio/ktor/client/HttpClient;LA5/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Le4/k;Le4/k;LS3/c;)Ljava/lang/Object;", "processSession", "Lio/ktor/util/AttributeKey;", "attributeKey", "value", "addAttribute", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cause", "mapToSSEException", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sseRequestAttr", "Lio/ktor/util/AttributeKey;", "getSseRequestAttr", "()Lio/ktor/util/AttributeKey;", "reconnectionTimeAttr", "getReconnectionTimeAttr", "showCommentEventsAttr", "getShowCommentEventsAttr", "showRetryEventsAttr", "getShowRetryEventsAttr", "deserializerAttr", "getDeserializerAttr", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt {
    private static final AttributeKey<n> deserializerAttr;
    private static final AttributeKey<A5.a> reconnectionTimeAttr;
    private static final AttributeKey<Boolean> showCommentEventsAttr;
    private static final AttributeKey<Boolean> showRetryEventsAttr;
    private static final AttributeKey<Boolean> sseRequestAttr;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1444w interfaceC1444wA2;
        InterfaceC1444w interfaceC1444wA3;
        InterfaceC1444w interfaceC1444wA4;
        Class cls = Boolean.TYPE;
        InterfaceC1425d interfaceC1425dB = y.a.b(Boolean.class);
        InterfaceC1444w interfaceC1444wC = null;
        try {
            interfaceC1444wA = y.a(cls);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        sseRequestAttr = new AttributeKey<>("SSERequestFlag", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        InterfaceC1425d interfaceC1425dB2 = y.a.b(A5.a.class);
        try {
            interfaceC1444wA2 = y.a(A5.a.class);
        } catch (Throwable unused2) {
            interfaceC1444wA2 = null;
        }
        reconnectionTimeAttr = new AttributeKey<>("SSEReconnectionTime", new TypeInfo(interfaceC1425dB2, interfaceC1444wA2));
        InterfaceC1425d interfaceC1425dB3 = y.a.b(Boolean.class);
        try {
            interfaceC1444wA3 = y.a(cls);
        } catch (Throwable unused3) {
            interfaceC1444wA3 = null;
        }
        showCommentEventsAttr = new AttributeKey<>("SSEShowCommentEvents", new TypeInfo(interfaceC1425dB3, interfaceC1444wA3));
        InterfaceC1425d interfaceC1425dB4 = y.a.b(Boolean.class);
        try {
            interfaceC1444wA4 = y.a(cls);
        } catch (Throwable unused4) {
            interfaceC1444wA4 = null;
        }
        showRetryEventsAttr = new AttributeKey<>("SSEShowRetryEvents", new TypeInfo(interfaceC1425dB4, interfaceC1444wA4));
        z zVar = y.a;
        InterfaceC1425d interfaceC1425dB5 = zVar.b(n.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            interfaceC1444wC = y.c(n.class, AbstractC0847h.q(y.a(TypeInfo.class)), AbstractC0847h.q(y.a(String.class)), AbstractC0847h.q(zVar.l(zVar.b(Object.class), Collections.EMPTY_LIST, true)));
        } catch (Throwable unused5) {
        }
        deserializerAttr = new AttributeKey<>("SSEDeserializer", new TypeInfo(interfaceC1425dB5, interfaceC1444wC));
    }

    public static final void SSE(HttpClientConfig<?> httpClientConfig, k kVar) {
        l.f("<this>", httpClientConfig);
        l.f("config", kVar);
        httpClientConfig.install(SSEKt.getSSE(), new io.github.jan.supabase.auth.a(2, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C SSE$lambda$0(k kVar, SSEConfig sSEConfig) {
        l.f("$this$install", sSEConfig);
        kVar.invoke(sSEConfig);
        return C.a;
    }

    private static final <T> void addAttribute(HttpRequestBuilder httpRequestBuilder, AttributeKey<T> attributeKey, T t7) {
        if (t7 != null) {
            httpRequestBuilder.getAttributes().put(attributeKey, t7);
        }
    }

    public static final AttributeKey<n> getDeserializerAttr() {
        return deserializerAttr;
    }

    public static final AttributeKey<A5.a> getReconnectionTimeAttr() {
        return reconnectionTimeAttr;
    }

    public static final AttributeKey<Boolean> getShowCommentEventsAttr() {
        return showCommentEventsAttr;
    }

    public static final AttributeKey<Boolean> getShowRetryEventsAttr() {
        return showRetryEventsAttr;
    }

    public static final AttributeKey<Boolean> getSseRequestAttr() {
        return sseRequestAttr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable mapToSSEException(HttpResponse httpResponse, Throwable th) {
        return (!(th instanceof SSEClientException) || ((SSEClientException) th).getResponse() == null) ? new SSEClientException(httpResponse, th, th.getMessage()) : th;
    }

    /* renamed from: processSession-rp2poPw, reason: not valid java name */
    private static final <T> Object m106processSessionrp2poPw(HttpClient httpClient, A5.a aVar, Boolean bool, Boolean bool2, k kVar, k kVar2, S3.c<? super T> cVar) {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        D.b();
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, Boolean.TRUE);
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, aVar);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        kVar2.invoke(httpRequestBuilder);
        new HttpStatement(httpRequestBuilder, httpClient);
        l.k();
        throw null;
    }

    /* renamed from: serverSentEvents-1wIb-0I, reason: not valid java name */
    public static final Object m107serverSentEvents1wIb0I(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objM115serverSentEventsmY9Nd3A = m115serverSentEventsmY9Nd3A(httpClient, new a(str, str2, num, str3, kVar, 0), aVar, bool, bool2, nVar, cVar);
        return objM115serverSentEventsmY9Nd3A == T3.a.f9048k ? objM115serverSentEventsmY9Nd3A : C.a;
    }

    /* renamed from: serverSentEvents-1wIb-0I$default, reason: not valid java name */
    public static /* synthetic */ Object m108serverSentEvents1wIb0I$default(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            aVar = null;
        }
        if ((i7 & 32) != 0) {
            bool = null;
        }
        if ((i7 & 64) != 0) {
            bool2 = null;
        }
        if ((i7 & 128) != 0) {
            kVar = new io.ktor.client.b(27);
        }
        return m107serverSentEvents1wIb0I(httpClient, str, str2, num, str3, aVar, bool, bool2, kVar, nVar, cVar);
    }

    /* renamed from: serverSentEvents-3bFjkrY, reason: not valid java name */
    public static final Object m109serverSentEvents3bFjkrY(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objM115serverSentEventsmY9Nd3A = m115serverSentEventsmY9Nd3A(httpClient, new b(1, str, kVar), aVar, bool, bool2, nVar, cVar);
        return objM115serverSentEventsmY9Nd3A == T3.a.f9048k ? objM115serverSentEventsmY9Nd3A : C.a;
    }

    /* renamed from: serverSentEvents-3bFjkrY$default, reason: not valid java name */
    public static /* synthetic */ Object m110serverSentEvents3bFjkrY$default(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.b(26);
        }
        return m109serverSentEvents3bFjkrY(httpClient, str, aVar, bool, bool2, kVar, nVar, cVar);
    }

    /* renamed from: serverSentEvents-BqdlHlk, reason: not valid java name */
    public static final Object m111serverSentEventsBqdlHlk(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar2, S3.c<? super C> cVar) throws Throwable {
        Object objM113serverSentEventsMswn_c = m113serverSentEventsMswn_c(httpClient, new a(str, str2, num, str3, kVar, 3), nVar, aVar, bool, bool2, nVar2, cVar);
        return objM113serverSentEventsMswn_c == T3.a.f9048k ? objM113serverSentEventsMswn_c : C.a;
    }

    /* renamed from: serverSentEvents-BqdlHlk$default, reason: not valid java name */
    public static /* synthetic */ Object m112serverSentEventsBqdlHlk$default(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            aVar = null;
        }
        if ((i7 & 64) != 0) {
            bool = null;
        }
        if ((i7 & 128) != 0) {
            bool2 = null;
        }
        if ((i7 & 256) != 0) {
            kVar = new io.ktor.client.b(24);
        }
        return m111serverSentEventsBqdlHlk(httpClient, str, str2, num, str3, nVar, aVar, bool, bool2, kVar, nVar2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: serverSentEvents-Mswn-_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m113serverSentEventsMswn_c(io.ktor.client.HttpClient r12, e4.k r13, e4.n r14, A5.a r15, java.lang.Boolean r16, java.lang.Boolean r17, e4.n r18, S3.c<? super O3.C> r19) throws java.lang.Throwable {
        /*
            r0 = r19
            boolean r1 = r0 instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8
            if (r1 == 0) goto L16
            r1 = r0
            io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 r1 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 r1 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.result
            T3.a r1 = T3.a.f9048k
            int r2 = r8.label
            r9 = 0
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L43
            if (r2 != r10) goto L3b
            java.lang.Object r12 = r8.L$0
            io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization r12 = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) r12
            P3.r.Y(r0)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L37
            goto L75
        L33:
            r0 = move-exception
            r13 = r0
            goto L87
        L37:
            r0 = move-exception
            r13 = r0
            goto L97
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r8.L$0
            e4.n r12 = (e4.n) r12
            P3.r.Y(r0)
            goto L66
        L4b:
            P3.r.Y(r0)
            r0 = r18
            r8.L$0 = r0
            r8.label = r3
            r2 = r12
            r7 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r12 = m123serverSentEventsSessionmY9Nd3A(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r1) goto L63
            goto L73
        L63:
            r11 = r0
            r0 = r12
            r12 = r11
        L66:
            r13 = r0
            io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization r13 = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) r13
            r8.L$0 = r13     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            r8.label = r10     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            java.lang.Object r12 = r12.invoke(r13, r8)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            r12 = r13
        L75:
            H5.D.h(r12, r9)
            O3.C r12 = O3.C.a
            return r12
        L7b:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
            goto L87
        L81:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
            goto L97
        L87:
            io.ktor.client.call.HttpClientCall r14 = r12.getCall()     // Catch: java.lang.Throwable -> L94
            io.ktor.client.statement.HttpResponse r14 = r14.getResponse()     // Catch: java.lang.Throwable -> L94
            java.lang.Throwable r13 = mapToSSEException(r14, r13)     // Catch: java.lang.Throwable -> L94
            throw r13     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            r13 = r0
            goto L98
        L97:
            throw r13     // Catch: java.lang.Throwable -> L94
        L98:
            H5.D.h(r12, r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt.m113serverSentEventsMswn_c(io.ktor.client.HttpClient, e4.k, e4.n, A5.a, java.lang.Boolean, java.lang.Boolean, e4.n, S3.c):java.lang.Object");
    }

    /* renamed from: serverSentEvents-Mswn-_c$default, reason: not valid java name */
    public static /* synthetic */ Object m114serverSentEventsMswn_c$default(HttpClient httpClient, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        if ((i7 & 16) != 0) {
            bool2 = null;
        }
        return m113serverSentEventsMswn_c(httpClient, kVar, nVar, aVar, bool, bool2, nVar2, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r14.invoke(r9, r6) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r9v5, types: [O3.C, java.lang.Object] */
    /* renamed from: serverSentEvents-mY9Nd3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m115serverSentEventsmY9Nd3A(io.ktor.client.HttpClient r9, e4.k r10, A5.a r11, java.lang.Boolean r12, java.lang.Boolean r13, e4.n r14, S3.c<? super O3.C> r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1
            if (r0 == 0) goto L14
            r0 = r15
            io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 r0 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 r0 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r7 = 0
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3f
            if (r1 != r8) goto L37
            java.lang.Object r9 = r6.L$0
            io.ktor.client.plugins.sse.ClientSSESession r9 = (io.ktor.client.plugins.sse.ClientSSESession) r9
            P3.r.Y(r15)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            goto L69
        L31:
            r0 = move-exception
            r10 = r0
            goto L6f
        L34:
            r0 = move-exception
            r10 = r0
            goto L7f
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r6.L$0
            r14 = r9
            e4.n r14 = (e4.n) r14
            P3.r.Y(r15)
            goto L5b
        L48:
            P3.r.Y(r15)
            r6.L$0 = r14
            r6.label = r2
            r1 = r9
            r5 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Object r15 = m121serverSentEventsSessioni8z2VEo(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L5b
            goto L68
        L5b:
            r9 = r15
            io.ktor.client.plugins.sse.ClientSSESession r9 = (io.ktor.client.plugins.sse.ClientSSESession) r9
            r6.L$0 = r9     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            r6.label = r8     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            java.lang.Object r10 = r14.invoke(r9, r6)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L34
            if (r10 != r0) goto L69
        L68:
            return r0
        L69:
            H5.D.h(r9, r7)
            O3.C r9 = O3.C.a
            return r9
        L6f:
            io.ktor.client.call.HttpClientCall r11 = r9.getCall()     // Catch: java.lang.Throwable -> L7c
            io.ktor.client.statement.HttpResponse r11 = r11.getResponse()     // Catch: java.lang.Throwable -> L7c
            java.lang.Throwable r10 = mapToSSEException(r11, r10)     // Catch: java.lang.Throwable -> L7c
            throw r10     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            r10 = r0
            goto L80
        L7f:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L80:
            H5.D.h(r9, r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt.m115serverSentEventsmY9Nd3A(io.ktor.client.HttpClient, e4.k, A5.a, java.lang.Boolean, java.lang.Boolean, e4.n, S3.c):java.lang.Object");
    }

    /* renamed from: serverSentEvents-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m116serverSentEventsmY9Nd3A$default(HttpClient httpClient, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        return m115serverSentEventsmY9Nd3A(httpClient, kVar, aVar, bool, bool2, nVar, cVar);
    }

    /* renamed from: serverSentEvents-pTj2aPc, reason: not valid java name */
    public static final Object m117serverSentEventspTj2aPc(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar2, S3.c<? super C> cVar) throws Throwable {
        Object objM113serverSentEventsMswn_c = m113serverSentEventsMswn_c(httpClient, new b(2, str, kVar), nVar, aVar, bool, bool2, nVar2, cVar);
        return objM113serverSentEventsMswn_c == T3.a.f9048k ? objM113serverSentEventsMswn_c : C.a;
    }

    /* renamed from: serverSentEvents-pTj2aPc$default, reason: not valid java name */
    public static /* synthetic */ Object m118serverSentEventspTj2aPc$default(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        if ((i7 & 16) != 0) {
            bool2 = null;
        }
        if ((i7 & 32) != 0) {
            kVar = new io.ktor.client.b(29);
        }
        return m117serverSentEventspTj2aPc(httpClient, str, nVar, aVar, bool, bool2, kVar, nVar2, cVar);
    }

    /* renamed from: serverSentEventsSession-Mswn-_c, reason: not valid java name */
    public static final Object m119serverSentEventsSessionMswn_c(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) {
        return m123serverSentEventsSessionmY9Nd3A(httpClient, nVar, aVar, bool, bool2, new b(0, str, kVar), cVar);
    }

    /* renamed from: serverSentEventsSession-Mswn-_c$default, reason: not valid java name */
    public static /* synthetic */ Object m120serverSentEventsSessionMswn_c$default(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        if ((i7 & 16) != 0) {
            bool2 = null;
        }
        if ((i7 & 32) != 0) {
            kVar = new io.ktor.client.b(25);
        }
        return m119serverSentEventsSessionMswn_c(httpClient, str, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: serverSentEventsSession-i8z2VEo, reason: not valid java name */
    public static final Object m121serverSentEventsSessioni8z2VEo(HttpClient httpClient, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) throws Throwable {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        C0276q c0276qB = D.b();
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, Boolean.TRUE);
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, aVar);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        D.x(httpClient, null, new BuildersKt$serverSentEventsSessioni8z2VEo$$inlined$processSessionrp2poPw$1(new HttpStatement(httpRequestBuilder, httpClient), c0276qB, null), 3);
        Object objK = c0276qB.k(cVar);
        T3.a aVar2 = T3.a.f9048k;
        return objK;
    }

    /* renamed from: serverSentEventsSession-i8z2VEo$default, reason: not valid java name */
    public static /* synthetic */ Object m122serverSentEventsSessioni8z2VEo$default(HttpClient httpClient, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            bool = null;
        }
        if ((i7 & 4) != 0) {
            bool2 = null;
        }
        return m121serverSentEventsSessioni8z2VEo(httpClient, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final Object m124serverSentEventsSessionmY9Nd3A(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) {
        return m121serverSentEventsSessioni8z2VEo(httpClient, aVar, bool, bool2, new b(3, str, kVar), cVar);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m126serverSentEventsSessionmY9Nd3A$default(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new c(9);
        }
        return m124serverSentEventsSessionmY9Nd3A(httpClient, str, aVar, bool, bool2, kVar, (S3.c<? super ClientSSESession>) cVar);
    }

    /* renamed from: serverSentEventsSession-tL6_L-A, reason: not valid java name */
    public static final Object m127serverSentEventsSessiontL6_LA(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) {
        return m123serverSentEventsSessionmY9Nd3A(httpClient, nVar, aVar, bool, bool2, new a(str, str2, num, str3, kVar, 2), cVar);
    }

    /* renamed from: serverSentEventsSession-tL6_L-A$default, reason: not valid java name */
    public static /* synthetic */ Object m128serverSentEventsSessiontL6_LA$default(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            aVar = null;
        }
        if ((i7 & 64) != 0) {
            bool = null;
        }
        if ((i7 & 128) != 0) {
            bool2 = null;
        }
        if ((i7 & 256) != 0) {
            kVar = new c(1);
        }
        return m127serverSentEventsSessiontL6_LA(httpClient, str, str2, num, str3, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: serverSentEventsSession-xEWcMm4, reason: not valid java name */
    public static final Object m129serverSentEventsSessionxEWcMm4(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) {
        return m121serverSentEventsSessioni8z2VEo(httpClient, aVar, bool, bool2, new a(str, str2, num, str3, kVar, 1), cVar);
    }

    /* renamed from: serverSentEventsSession-xEWcMm4$default, reason: not valid java name */
    public static /* synthetic */ Object m130serverSentEventsSessionxEWcMm4$default(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            aVar = null;
        }
        if ((i7 & 32) != 0) {
            bool = null;
        }
        if ((i7 & 64) != 0) {
            bool2 = null;
        }
        if ((i7 & 128) != 0) {
            kVar = new c(4);
        }
        return m129serverSentEventsSessionxEWcMm4(httpClient, str, str2, num, str3, aVar, bool, bool2, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_Mswn__c$lambda$17(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_Mswn__c$lambda$18(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEventsSession", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_mY9Nd3A$lambda$4(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_mY9Nd3A$lambda$5(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEventsSession", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_tL6_L_A$lambda$15(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_tL6_L_A$lambda$16(String str, String str2, Integer num, String str3, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEventsSession", httpRequestBuilder);
        HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_xEWcMm4$lambda$2(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEventsSession_xEWcMm4$lambda$3(String str, String str2, Integer num, String str3, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEventsSession", httpRequestBuilder);
        HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_1wIb_0I$lambda$6(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_1wIb_0I$lambda$7(String str, String str2, Integer num, String str3, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEvents", httpRequestBuilder);
        HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_3bFjkrY$lambda$8(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_3bFjkrY$lambda$9(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEvents", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_BqdlHlk$lambda$19(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_BqdlHlk$lambda$20(String str, String str2, Integer num, String str3, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEvents", httpRequestBuilder);
        HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_pTj2aPc$lambda$21(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C serverSentEvents_pTj2aPc$lambda$22(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$serverSentEvents", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* renamed from: sse-BAHpl2s, reason: not valid java name */
    public static final Object m131sseBAHpl2s(HttpClient httpClient, String str, String str2, Integer num, String str3, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c<? super C> cVar) throws Throwable {
        Object objM111serverSentEventsBqdlHlk = m111serverSentEventsBqdlHlk(httpClient, str, str2, num, str3, nVar, aVar, bool, bool2, kVar, nVar2, cVar);
        return objM111serverSentEventsBqdlHlk == T3.a.f9048k ? objM111serverSentEventsBqdlHlk : C.a;
    }

    /* renamed from: sse-BAHpl2s$default, reason: not valid java name */
    public static /* synthetic */ Object m132sseBAHpl2s$default(HttpClient httpClient, String str, String str2, Integer num, String str3, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new c(3);
        }
        if ((i7 & 64) != 0) {
            aVar = null;
        }
        if ((i7 & 128) != 0) {
            bool = null;
        }
        if ((i7 & 256) != 0) {
            bool2 = null;
        }
        return m131sseBAHpl2s(httpClient, str, str2, num, str3, kVar, nVar, aVar, bool, bool2, nVar2, cVar);
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final Object m134sseMswn_c(HttpClient httpClient, String str, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objM109serverSentEvents3bFjkrY = m109serverSentEvents3bFjkrY(httpClient, str, aVar, bool, bool2, kVar, nVar, cVar);
        return objM109serverSentEvents3bFjkrY == T3.a.f9048k ? objM109serverSentEvents3bFjkrY : C.a;
    }

    /* renamed from: sse-Mswn-_c$default, reason: not valid java name */
    public static /* synthetic */ Object m136sseMswn_c$default(HttpClient httpClient, String str, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new c(7);
        }
        return m134sseMswn_c(httpClient, str, kVar, (i7 & 4) != 0 ? null : aVar, (i7 & 8) != 0 ? null : bool, (i7 & 16) != 0 ? null : bool2, nVar, (S3.c<? super C>) cVar);
    }

    /* renamed from: sse-Q9yt8Vw, reason: not valid java name */
    public static final Object m137sseQ9yt8Vw(HttpClient httpClient, String str, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c<? super C> cVar) throws Throwable {
        Object objM117serverSentEventspTj2aPc = m117serverSentEventspTj2aPc(httpClient, str, nVar, aVar, bool, bool2, kVar, nVar2, cVar);
        return objM117serverSentEventspTj2aPc == T3.a.f9048k ? objM117serverSentEventspTj2aPc : C.a;
    }

    /* renamed from: sse-Q9yt8Vw$default, reason: not valid java name */
    public static /* synthetic */ Object m138sseQ9yt8Vw$default(HttpClient httpClient, String str, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new c(2);
        }
        return m137sseQ9yt8Vw(httpClient, str, kVar, nVar, (i7 & 8) != 0 ? null : aVar, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : bool2, nVar2, cVar);
    }

    /* renamed from: sse-mY9Nd3A, reason: not valid java name */
    public static final Object m139ssemY9Nd3A(HttpClient httpClient, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objM115serverSentEventsmY9Nd3A = m115serverSentEventsmY9Nd3A(httpClient, kVar, aVar, bool, bool2, nVar, cVar);
        return objM115serverSentEventsmY9Nd3A == T3.a.f9048k ? objM115serverSentEventsmY9Nd3A : C.a;
    }

    /* renamed from: sse-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m140ssemY9Nd3A$default(HttpClient httpClient, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        return m139ssemY9Nd3A(httpClient, kVar, aVar, bool, bool2, nVar, cVar);
    }

    /* renamed from: sse-tL6_L-A, reason: not valid java name */
    public static final Object m141ssetL6_LA(HttpClient httpClient, String str, String str2, Integer num, String str3, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objM107serverSentEvents1wIb0I = m107serverSentEvents1wIb0I(httpClient, str, str2, num, str3, aVar, bool, bool2, kVar, nVar, cVar);
        return objM107serverSentEvents1wIb0I == T3.a.f9048k ? objM107serverSentEvents1wIb0I : C.a;
    }

    /* renamed from: sse-tL6_L-A$default, reason: not valid java name */
    public static /* synthetic */ Object m142ssetL6_LA$default(HttpClient httpClient, String str, String str2, Integer num, String str3, k kVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.b(28);
        }
        if ((i7 & 32) != 0) {
            aVar = null;
        }
        if ((i7 & 64) != 0) {
            bool = null;
        }
        if ((i7 & 128) != 0) {
            bool2 = null;
        }
        return m141ssetL6_LA(httpClient, str, str2, num, str3, kVar, aVar, bool, bool2, nVar, cVar);
    }

    /* renamed from: sseSession-Mswn-_c, reason: not valid java name */
    public static final Object m143sseSessionMswn_c(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) {
        return m119serverSentEventsSessionMswn_c(httpClient, str, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-Mswn-_c$default, reason: not valid java name */
    public static /* synthetic */ Object m144sseSessionMswn_c$default(HttpClient httpClient, String str, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        if ((i7 & 16) != 0) {
            bool2 = null;
        }
        if ((i7 & 32) != 0) {
            kVar = new c(0);
        }
        return m143sseSessionMswn_c(httpClient, str, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-i8z2VEo, reason: not valid java name */
    public static final Object m145sseSessioni8z2VEo(HttpClient httpClient, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) {
        return m121serverSentEventsSessioni8z2VEo(httpClient, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-i8z2VEo$default, reason: not valid java name */
    public static /* synthetic */ Object m146sseSessioni8z2VEo$default(HttpClient httpClient, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            bool = null;
        }
        if ((i7 & 4) != 0) {
            bool2 = null;
        }
        return m145sseSessioni8z2VEo(httpClient, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final Object m148sseSessionmY9Nd3A(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) {
        return m124serverSentEventsSessionmY9Nd3A(httpClient, str, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m150sseSessionmY9Nd3A$default(HttpClient httpClient, String str, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new c(8);
        }
        return m148sseSessionmY9Nd3A(httpClient, str, aVar, bool, bool2, kVar, (S3.c<? super ClientSSESession>) cVar);
    }

    /* renamed from: sseSession-tL6_L-A, reason: not valid java name */
    public static final Object m151sseSessiontL6_LA(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) {
        return m127serverSentEventsSessiontL6_LA(httpClient, str, str2, num, str3, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-tL6_L-A$default, reason: not valid java name */
    public static /* synthetic */ Object m152sseSessiontL6_LA$default(HttpClient httpClient, String str, String str2, Integer num, String str3, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            aVar = null;
        }
        if ((i7 & 64) != 0) {
            bool = null;
        }
        if ((i7 & 128) != 0) {
            bool2 = null;
        }
        if ((i7 & 256) != 0) {
            kVar = new c(6);
        }
        return m151sseSessiontL6_LA(httpClient, str, str2, num, str3, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-xEWcMm4, reason: not valid java name */
    public static final Object m153sseSessionxEWcMm4(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESession> cVar) {
        return m129serverSentEventsSessionxEWcMm4(httpClient, str, str2, num, str3, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: sseSession-xEWcMm4$default, reason: not valid java name */
    public static /* synthetic */ Object m154sseSessionxEWcMm4$default(HttpClient httpClient, String str, String str2, Integer num, String str3, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            aVar = null;
        }
        if ((i7 & 32) != 0) {
            bool = null;
        }
        if ((i7 & 64) != 0) {
            bool2 = null;
        }
        if ((i7 & 128) != 0) {
            kVar = new c(5);
        }
        return m153sseSessionxEWcMm4(httpClient, str, str2, num, str3, aVar, bool, bool2, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sseSession_Mswn__c$lambda$24(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sseSession_mY9Nd3A$lambda$11(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sseSession_tL6_L_A$lambda$23(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sseSession_xEWcMm4$lambda$10(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sse_BAHpl2s$lambda$25(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sse_Mswn__c$lambda$13(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sse_Q9yt8Vw$lambda$26(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C sse_tL6_L_A$lambda$12(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final Object m123serverSentEventsSessionmY9Nd3A(HttpClient httpClient, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) throws Throwable {
        HttpClientPluginKt.plugin(httpClient, SSEKt.getSSE());
        C0276q c0276qB = D.b();
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, Boolean.TRUE);
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, aVar);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        addAttribute(httpRequestBuilder, deserializerAttr, nVar);
        D.x(httpClient, null, new BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(new HttpStatement(httpRequestBuilder, httpClient), c0276qB, null), 3);
        Object objK = c0276qB.k(cVar);
        T3.a aVar2 = T3.a.f9048k;
        return objK;
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final Object m133sseMswn_c(HttpClient httpClient, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c<? super C> cVar) throws Throwable {
        Object objM113serverSentEventsMswn_c = m113serverSentEventsMswn_c(httpClient, kVar, nVar, aVar, bool, bool2, nVar2, cVar);
        return objM113serverSentEventsMswn_c == T3.a.f9048k ? objM113serverSentEventsMswn_c : C.a;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final Object m147sseSessionmY9Nd3A(HttpClient httpClient, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c<? super ClientSSESessionWithDeserialization> cVar) {
        return m123serverSentEventsSessionmY9Nd3A(httpClient, nVar, aVar, bool, bool2, kVar, cVar);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m125serverSentEventsSessionmY9Nd3A$default(HttpClient httpClient, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        return m123serverSentEventsSessionmY9Nd3A(httpClient, nVar, aVar, bool, bool2, kVar, (S3.c<? super ClientSSESessionWithDeserialization>) cVar);
    }

    /* renamed from: sse-Mswn-_c$default, reason: not valid java name */
    public static /* synthetic */ Object m135sseMswn_c$default(HttpClient httpClient, k kVar, n nVar, A5.a aVar, Boolean bool, Boolean bool2, n nVar2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar = null;
        }
        if ((i7 & 8) != 0) {
            bool = null;
        }
        if ((i7 & 16) != 0) {
            bool2 = null;
        }
        return m133sseMswn_c(httpClient, kVar, nVar, aVar, bool, bool2, nVar2, (S3.c<? super C>) cVar);
    }

    /* renamed from: sseSession-mY9Nd3A$default, reason: not valid java name */
    public static /* synthetic */ Object m149sseSessionmY9Nd3A$default(HttpClient httpClient, n nVar, A5.a aVar, Boolean bool, Boolean bool2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        if ((i7 & 8) != 0) {
            bool2 = null;
        }
        return m147sseSessionmY9Nd3A(httpClient, nVar, aVar, bool, bool2, kVar, (S3.c<? super ClientSSESessionWithDeserialization>) cVar);
    }
}
