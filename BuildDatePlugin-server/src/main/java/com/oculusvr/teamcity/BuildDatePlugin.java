package com.oculusvr.teamcity;

import jetbrains.buildServer.serverSide.SBuild;
import jetbrains.buildServer.serverSide.parameters.AbstractBuildParametersProvider;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class BuildDatePlugin extends AbstractBuildParametersProvider {
    private SimpleDateFormat second = new SimpleDateFormat("s");
    private SimpleDateFormat secondLead0 = new SimpleDateFormat("ss");

    private SimpleDateFormat minute = new SimpleDateFormat("m");
    private SimpleDateFormat minuteLead0 = new SimpleDateFormat("mm");

    private SimpleDateFormat hour = new SimpleDateFormat("h");
    private SimpleDateFormat hour24 = new SimpleDateFormat("H");
    private SimpleDateFormat hourLead0 = new SimpleDateFormat("hh");
    private SimpleDateFormat hour24Lead0 = new SimpleDateFormat("HH");

    private SimpleDateFormat day = new SimpleDateFormat("d");
    private SimpleDateFormat dayLead0 = new SimpleDateFormat("dd");

    private SimpleDateFormat month = new SimpleDateFormat("M");
    private SimpleDateFormat monthLead0 = new SimpleDateFormat("MM");
    private SimpleDateFormat monthTextAbbrev = new SimpleDateFormat("MMM");
    private SimpleDateFormat monthText = new SimpleDateFormat("MMMM");

    private SimpleDateFormat shortYear = new SimpleDateFormat("yy");
    private SimpleDateFormat year = new SimpleDateFormat("yyyy");

    private SimpleDateFormat ampm = new SimpleDateFormat("aa");

    @NotNull
    @Override
    public Map<String, String> getParameters(@NotNull final SBuild build, final boolean emulationMode) {
        Date now = new Date();

        Map<String, String> parameters = super.getParameters(build, emulationMode);

        parameters.put("date.second", second.format(now));
        parameters.put("date.second.lead0", secondLead0.format(now));

        parameters.put("date.minute", minute.format(now));
        parameters.put("date.minute.lead0", minuteLead0.format(now));

        parameters.put("date.hour", hour.format(now));
        parameters.put("date.hour.24", hour24.format(now));
        parameters.put("date.hour.lead0", hourLead0.format(now));
        parameters.put("date.hour.24.lead0", hour24Lead0.format(now));

        parameters.put("date.day", day.format(now));
        parameters.put("date.day.lead0", dayLead0.format(now));

        parameters.put("date.month", month.format(now));
        parameters.put("date.month.lead0", monthLead0.format(now));
        parameters.put("date.month.text", monthText.format(now));
        parameters.put("date.month.text.abbrev", monthTextAbbrev.format(now));

        parameters.put("date.year.2digit", shortYear.format(now));
        parameters.put("date.year", year.format(now));

        parameters.put("date.ampm", ampm.format(now));
        return parameters;
    }
}