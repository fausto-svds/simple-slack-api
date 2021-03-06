package com.ullink.slack.simpleslackapi.impl;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.events.SlackChannelRenamed;

public class SlackChannelRenamedImpl implements SlackChannelRenamed
{
    private SlackChannel slackChannel;
    private String       newName;

    SlackChannelRenamedImpl(SlackChannel slackChannel, String newName)
    {
        this.slackChannel = slackChannel;
        this.newName = newName;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    @Override
    public String getNewName()
    {
        return newName;
    }

}
